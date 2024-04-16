import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 백준 1600 말이 되고픈 원숭이 
public class Main {
	static int K;  // 원숭이가 말이 될 수 있는 횟수
	static int H;
	static int W;
	
	static int[][] array;
	static boolean[][][] visited;
	
	static int[] horseX = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] horseY = {1, -1, 2, -2, 2, -2, 1, -1};
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	static int min = Integer.MAX_VALUE;
	
	static class Node{
		int x, y, cnt, k;

		public Node(int x, int y, int cnt, int k) {
			super();
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.k = k;
		}
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		K = Integer.parseInt(sc.readLine());
		st = new StringTokenizer(sc.readLine());
		
		W = Integer.parseInt(st.nextToken());  // 가로길이
		H = Integer.parseInt(st.nextToken());  // 세로길이
		
		array = new int[H][W];
		visited = new boolean[H][W][K+1];
		
		// array에 값 넣기
		for(int i=0; i<H; i++) {
			st = new StringTokenizer(sc.readLine());
			for(int j=0; j<W; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// check
		// checkPrint(array, H, W);
		
		min = BFS(0, 0);
		if(min == Integer.MAX_VALUE) System.out.println("-1");
		else System.out.println(min);
		
		
	}

	private static int BFS(int x, int y) {
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.offer(new Node(x, y, 0, K));
		visited[x][y][K] = true;
		
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			// 도착했을 경우
			if(curr.x == H-1 && curr.y == W-1) return curr.cnt;
			
			// monkey
			for(int i=0; i<4; i++) {
				int currX = dx[i] + curr.x;
				int currY = dy[i] + curr.y;
				if(currX>=0 && currX<H && currY>=0 && currY<W
						&& !visited[currX][currY][curr.k] && array[currX][currY] == 0) {
					visited[currX][currY][curr.k] = true;
					queue.offer(new Node(currX, currY, curr.cnt+1, curr.k));
				}
			}
			
			// holse
			if(curr.k > 0) {
				for(int i=0; i<8; i++) {
					int currX = horseX[i] + curr.x;
					int currY = horseY[i] + curr.y;
					if(currX>=0 && currX<H && currY>=0 && currY<W
							&& !visited[currX][currY][curr.k-1] && array[currX][currY] == 0) {
						visited[currX][currY][curr.k-1] = true;
						queue.offer(new Node(currX, currY, curr.cnt+1, curr.k-1));
					}
				}
				
			}
		}
		return min;
		
		
		
	}

	private static void checkPrint(int[][] array2, int h, int w) {
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}