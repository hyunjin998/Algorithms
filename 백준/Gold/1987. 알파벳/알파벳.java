import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1987 알파벳 
public class Main {

	static int R;
	static int C;

	static int[][] array;
	static boolean[] visited;

	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	static int idx;
	static int ans = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());

		R = Integer.parseInt(st.nextToken()); // 세로
		C = Integer.parseInt(st.nextToken()); // 가로

		array = new int[R + 1][C + 1]; // 현재 좌표는 (1,1)
		visited = new boolean[26]; // 알파벳은 26가지

		// array에 값 입력받기
		for (int i = 1; i <= R; i++) {
			String str = sc.readLine();
			for (int j = 1; j <= C; j++) {
				array[i][j] = str.charAt(j-1) - 'A';
			}
		}

		// check
		// System.out.println(Arrays.deepToString(array));

		DFS(1, 1, 0);
		if(R==1 && C==1) ans = 1;
		System.out.println(ans);
	}

	private static void DFS(int x, int y, int cnt) {
		// idx = array[x][y];
		if(visited[array[x][y]]) {
			ans = Math.max(ans, cnt);
			return;
		}
		
		else {
			visited[array[x][y]] = true;
			for(int d = 0; d <4; d++) {
				int currX = dx[d] + x;
				int currY = dy[d] + y;
				
				if(currX >=1 && currX <= R && currY >= 1 && currY <= C) {
					DFS(currX, currY, cnt+1);
				}
			}
			
			visited[array[x][y]] = false;
		}

	}

}