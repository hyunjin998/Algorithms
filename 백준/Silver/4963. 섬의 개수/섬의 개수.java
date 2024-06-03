import java.util.Scanner;

public class Main {
	static int w, h; // width, height
	static int[][] Array;

	static int[] dr = { 0, -1, 0, 1, 1, -1, -1, 1 };
	static int[] dc = { 1, 0, -1, 0, 1, 1, -1, -1 };

	static int cnt;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			h = sc.nextInt(); // row
			w = sc.nextInt(); // column

			if (h == 0 && w == 0)
				break;
			Array = new int[w][h];
			visited = new boolean[w][h];

			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					Array[i][j] = sc.nextInt();
				}
			}

			int cnt =0;
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					if ((Array[i][j] == 1) && (!visited[i][j])) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	private static void dfs(int i, int j) {
		visited[i][j] = true;

		for (int k = 0; k < 8; k++) {
			int xPos = i + dr[k];
			int yPos = j + dc[k];

			if ((xPos >= 0) && (yPos >= 0) && (xPos < w) && (yPos < h) && (!visited[xPos][yPos])
					&& (Array[xPos][yPos] == 1)) {
				dfs(xPos, yPos);
			}
		}
	}
}