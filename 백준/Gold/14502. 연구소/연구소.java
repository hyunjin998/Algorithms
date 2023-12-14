import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;  // 행
	static int M;  // 열
	static int[][] array;  // 이차원 배열
	static int[][] copy;  // array를 카피할 이차원 배열
	static int[] sel;  // 벽을 어디에 세울지 선택하는 선택배열
	
	static ArrayList<Pos> wall;  // 벽을 세울곳의 위치좌표를 저장하는 어레이리스트
	static ArrayList<Pos> virus;  // 바이러스의 위치좌표를 저장하는 어레이리스트 

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int cnt;  // 안전영역의 크기
	static int max;  // 안전영역의 최댓값, 출력값
	
	// 빈 칸의 위치좌표를 저장
	static class Pos {
		int x;
		int y;

		public Pos(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		array = new int[N][M];
		copy = new int[N][M];
		
		sel = new int[3]; // 벽은 3개 세울 수 있음
		wall = new ArrayList<>();
		virus = new ArrayList<>();

		max = 0;  // 안전영역의 최소값은 0
		
		// array에 입력값 넣기
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(sc.readLine());
			for (int j = 0; j < M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				copy[i][j] = array[i][j];
			}
		}

		// check
		// System.out.println(Arrays.deepToString(array));
		// System.out.println(Arrays.deepToString(copy));

		// 벽을 세울 수 있는 곳(1), 바이러스 위치(2) 찾아 list에 넣기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				
				// 빈 칸 이라면 (벽 X, 바이러스 X)
				if (array[i][j] == 0) {
					// 빈칸 좌표 list에 넣기
					wall.add(new Pos(i, j));
				}
				
				// 바이러스 담기
				if (array[i][j] == 2) {
					virus.add(new Pos(i, j));
				}
			}
		}
		

		// 조합 돌리기
		Combi(0, 0);

		/*
		 * 1. 어디에 벽을 세울지 중복없는 조합을 돌린다
		 * 2. 선택한 좌표 3군데에 벽(1)을 세운다
		 * 3. 벽을 세웠으면 BFS를 돌린다
		 * 4. 남아있는 0의 수를 카운트한다
		 * 5. 세웠던 벽을 다시 되돌린다.
		 */

		System.out.println(max);
		
	}

	
	// 1. 어디에 벽을 세울지 조합 돌린다
	private static void Combi(int idx, int k) {
		// basis part
		if (k == sel.length) {
			// check
			// System.out.println(Arrays.toString(sel));

			MakeWall();  // 골랐으면 벽 세워주기
			BFS();  // 세 개 골랐으면 BFS 돌리기
			max = Math.max(max, SafeZone());  // 0의 갯수 최댓값 업데이트
			RemoveWall();  // 세웠던 벽 복귀
			return;
		}

		
		// inductive part
		// 리스트 중에서 3개를 고르는 거니까 i는 list.size()만큼 돌려준다
		for (int i = idx; i < wall.size(); i++) {
			sel[k] = i;
			Combi(i + 1, k + 1);  // 중복 없는 조합
		}
	}
	
	
	// 2. 벽을 세운다
	private static void MakeWall() {
		// 선택배열의 크기만큼 돌면서 벽을 세울 곳의 위치좌표를 가져온다
		for (int i = 0; i < sel.length; i++) {
			int wallX = wall.get(sel[i]).x;
			int wallY = wall.get(sel[i]).y;
			
			array[wallX][wallY] = 1;  // 벽을 세워준다
		}

	}
	
	
	// 3. 벽을 세웠으면 바이러스를 퍼뜨려본다
	private static void BFS() {
		ArrayDeque<Pos> queue = new ArrayDeque<>();
		Pos curr;
		
		// 바이러스의 위치좌표를 받아와서 큐에 넣는다
		for(int i=0; i<virus.size(); i++) {
			curr = virus.get(i);
			queue.offer(curr);
		}

		// 큐가 비어있지 않을 때까지
		while (!queue.isEmpty()) {
			curr = queue.poll();
			// 사방탐색 
			for(int i=0; i<4; i++) {
				int currX = dx[i] + curr.x;
				int currY = dy[i] + curr.y;
				
				// 범위체크
				if(currX >=0 && currX < N && currY >=0 && currY < M
						&& array[currX][currY] == 0) {  // 빈칸일 경우에만 바이러스 퍼뜨리기 가능 
					array[currX][currY] = 2;  // 바이러스 퍼뜨리고 
					queue.offer(new Pos(currX, currY));  // 해당 좌표 큐에 넣기 
				}
			}
		}

	}
	
	
	// 4. 0의 갯수 세기
	private static int SafeZone() {
//		// check
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("\n");
		
		
		cnt = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(array[i][j] == 0) cnt++;
			}
		}
		return cnt;
		
	}
	
	
	// 5. 세웠던 벽 복귀
	private static void RemoveWall() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				array[i][j] = copy[i][j];
			}
		}
	}

	

}