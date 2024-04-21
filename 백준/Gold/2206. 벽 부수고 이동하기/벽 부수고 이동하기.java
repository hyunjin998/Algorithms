import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 2206 벽 부수고 이동하기
public class Main {

	static int N;
	static int M;
	
	static int[][] array;
	static boolean[][][] visited;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int min = Integer.MAX_VALUE;
	
	static class Node{
		int x;
		int y;
		int cnt;
		int k;
		
		public Node(int x, int y, int cnt, int k) {
			super();
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.k = k;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		array = new int[N][M];
		visited = new boolean[N][M][2];
		
		// array에 값 넣기
		for(int i=0; i<N; i++) {
			String str = sc.readLine();
			for (int j=0; j<M; j++) {
				array[i][j] = str.charAt(j)-'0';
			}
		}
		
		// check
		// CheckPrint(array, N, M);
		
		min = BFS(0, 0);
		if(min == Integer.MAX_VALUE) System.out.println("-1");
		else System.out.println(min);
		
		
	}

	private static int BFS(int x, int y) {
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.offer(new Node(x, y, 1, 1));
		visited[x][y][1] = true;
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			if(curr.x == N-1 && curr.y == M-1) return curr.cnt;
			
			
			for(int i=0; i<4; i++) {
				int currX = curr.x + dx[i];
				int currY = curr.y + dy[i];
				if(currX >=0 && currX < N && currY >=0 && currY < M
						&& !visited[currX][currY][curr.k] && array[currX][currY] == 0) {
					visited[currX][currY][curr.k] = true;
					queue.offer(new Node(currX, currY, curr.cnt+1, curr.k));
				}
			}
			
			// 벽 뿌수기
			if(curr.k == 1) {
				for(int i=0; i<4; i++) {
					int currX = curr.x + dx[i];
					int currY = curr.y + dy[i];
					if(currX >=0 && currX < N && currY >=0 && currY < M
							&& !visited[currX][currY][curr.k-1] && array[currX][currY] == 1) {
						visited[currX][currY][curr.k-1] = true;
						queue.offer(new Node(currX, currY, curr.cnt+1, curr.k-1));
					}
				}
			}
		}
		return min;
	}

	private static void CheckPrint(int[][] array2, int n2, int m2) {
		for(int i=0; i<n2; i++) {
			for(int j=0; j<m2; j++){
				System.out.print(array2[i][j]);
			}
			System.out.println();
		}
		
	}

}