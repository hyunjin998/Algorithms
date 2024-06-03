import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 1012 유기농 배추
public class Main {
	
	static int M;
	static int N;
	static int K;
	
	static int[][] array;
	static boolean[][] visited;
	static ArrayList<Point> list;
	
	// 사방탐색
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int cnt;
	
	static class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(sc.readLine());
		for(int test_case=0; test_case<T; test_case++) {
			st = new StringTokenizer(sc.readLine());
			M = Integer.parseInt(st.nextToken());  // 열
			N = Integer.parseInt(st.nextToken());  // 행
			K = Integer.parseInt(st.nextToken());  // 배추 위치의 갯수
			
			array = new int[M][N];
			visited = new boolean[M][N];
			list = new ArrayList<>();
			
			// array에 배추 채우기
			for(int i=0; i<K; i++) {
				st = new StringTokenizer(sc.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());				
				array[x][y] = 1;
			}
			// check
			// checkPrint(array, M, N);
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(array[i][j] == 1) {
						list.add(new Point(i, j));
					}
				}
			}
			
			for(Point i : list) {
				if(!visited[i.x][i.y]) {					
					BFS(i.x, i.y);
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}

	}


	private static void BFS(int x, int y) {
		ArrayDeque<Point> queue = new ArrayDeque<>();
		queue.offer(new Point(x, y));
		visited[x][y] = true;  // 방문처리
		cnt++;
		
		// check
		// System.out.println(x + " " + y);
		
		while(!queue.isEmpty()) {
			Point curr = queue.poll();
			int currX = curr.x;
			int currY = curr.y;
			
			// check
			// System.out.println("cnt: " + cnt);
			
			for(int i=0; i<4; i++) {
				int nx = curr.x + dx[i];
				int ny = curr.y + dy[i];
				
				// check
				// System.out.println("x : "  + currX + " y : " + currY);
				if(nx >=0 && nx < M && ny >=0 && ny < N
						&& !visited[nx][ny] && array[nx][ny] == 1) {
					visited[nx][ny] = true;
					array[nx][ny] = cnt;
					queue.offer(new Point(nx, ny));
					
					// check
					// checkPrint(array, M, N);
				}
			}
		}
		
	}

	
	
	private static void checkPrint(int[][] array2, int m, int n) {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}