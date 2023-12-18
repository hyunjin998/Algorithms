import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N;  // 연구소의 크기
	static int M;  // 놓을 수 있는 바이러스의 갯수
	static int[][] array;
	static int[][] copy;
	static ArrayList <Pos> list;  // 바이러스를 놓을 수 있는 위치좌표를 담는 리스트
	static ArrayList <Pos> virus;  // 바이러스의 위치좌표를 담는 리스트
	static int[] sel;  // list의 인덱스를 담는 선택배열 (바이러스의 위치를 선택)
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	static int round;
	static int ans;
	
	
	static class Pos{
		int x;
		int y;
		int t;  // 바이러스가 퍼지는데 걸리는 시간

		public Pos(int x, int y, int t) {
			super();
			this.x = x;
			this.y = y;
			this.t = t;
		}	

	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		array = new int[N][N];
		copy = new int[N][N];
		
		list = new ArrayList<>();
		virus = new ArrayList<>();
		sel = new int[M];
		ans = Integer.MAX_VALUE;
		
		// array에 입력값 받기 
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(sc.readLine());
			for(int j=0; j<N; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				copy[i][j] = array[i][j];
				
				// 1. 바이러스를 놓을 수 있는 위치좌표 리스트에 담기
				if(array[i][j] == 2) {
					list.add(new Pos(i, j, 0));
					array[i][j] = 0;  // 우선 빈칸으로 바꿔준다
					copy[i][j] = 0;
				}
			}
		}
		
		// check
		// System.out.println(Arrays.deepToString(array));
		// System.out.println(Arrays.deepToString(copy));
		
		/*
		 * 1. 바이러스 위치(2) 리스트에 담기
		 * 2. 어디에 바이러스 놓을지 중복 없는 조합 돌리기
		 * 3. 바이러스 위치 놓기
		 * 4. BFS 돌리면서 바이러스 퍼뜨리기
		 * 5. 바이러스가 전부 퍼졌는지 체크
		 * 6. 맵 되돌리기
		 */
		
		Combi(0, 0);
		// ans 값이 변하지 않았다는 것은 바이러스가 모두 퍼진적이 한 번도 없다는 뜻 
		if(ans == Integer.MAX_VALUE) ans = -1;
		System.out.println(ans);
		
	}

	// 2. 어디에 바이러스 놓을지 중복 없는 조합 돌리기 
	private static void Combi(int idx, int k) {
		if(k == sel.length) {
			// check
			// System.out.println(Arrays.toString(sel));
			SetVirus();  // 3. 바이러스 위치 놓기
			BFS();  // 4. 바이러스 퍼뜨리기
			CheckVirus();  // 5. 바이러스가 전부 퍼졌는지 체크
			RemoveVirus();  // 6. 맵 되돌리기 
			return;
		}
		
		
		
		
		// inductive part
		// 어디에 바이러스를 담을지 선택할거니까
		// 반복문의 크기는 리스트의 크기만큼 돈다
		for(int i=idx; i<list.size(); i++) {
			sel[k] = i;  // 선택배열은 리스트의 인덱스를 담는다
			Combi(i+1, k+1);  // 중복 없는 조합이므로 i+1
		}
		
	}
	

	// 3. 바이러스 위치 놓기 
	private static void SetVirus() {
		virus = new ArrayList<>();
		
		// 반복문은 선택배열의 크기만큼 돌면서 바이러스의 위치 좌표를 가져온다 
		for(int i=0; i<M; i++) {
			int x = list.get(sel[i]).x;
			int y = list.get(sel[i]).y;
			
			array[x][y] = 2;  // 바이러스 놓기
			virus.add(new Pos(x, y, 0));  // 바이러스의 위치좌표 담기
		}
		
		// check
		// System.out.println(Arrays.deepToString(array));
		
	}
	
	

	// 4.
	private static void BFS() {
		ArrayDeque<Pos> queue = new ArrayDeque<>();
		round = 0;
		
		// 바이러스 위치좌표를 queue에 담기
		for(int i=0; i<virus.size(); i++) {
			queue.offer(virus.get(i));
		}
		
		while(!queue.isEmpty()) {
			Pos curr = queue.poll();

			// 사방탐색
			for(int i=0; i<4; i++) {
				int currX = dx[i] + curr.x;
				int currY = dy[i] + curr.y;
				
				// 범위체크
				if(currX >=0 && currX < N && currY >=0 && currY < N && array[currX][currY] == 0) {
					array[currX][currY] = 2;  // 바이러스 퍼뜨리고
					queue.offer(new Pos(currX, currY, curr.t+1));  // 바이러스 위치좌표 담기
				}

			}
			
			round = Math.max(round, curr.t);  // 4
			// System.out.println(ans);
		
		}
		// check
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				System.out.print(array[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
	}
	
	// 5. 바이러스가 전부 퍼졌는지 체크
	private static void CheckVirus() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				// 빈칸이 있으면 바이러스가 전부 퍼지지 않은 거임
				if(array[i][j] == 0) {
					return;
				}
			}
		}
		ans = Math.min(ans,  round);
	}
	
	
	// 6. 맵 되돌리기
	private static void RemoveVirus() {
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				array[i][j] = copy[i][j];
			}
		}
		
	}

}