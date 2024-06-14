import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		// System.setIn(new FileInputStream("input"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(st.nextToken());
		int[][] board = new int[R][C];
		int[][] tmp = new int[R][C];

		for (int r = 0; r < R; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < C; c++) {
				board[r][c] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			board = option(board, Integer.parseInt(st.nextToken()));
		}

		print(board);

	}

	private static int[][] option(int[][] board, int num) {
		int R = board.length;
		int C = board[0].length;
		int[][] tmp = new int[R][C];

		switch (num) {
		case 1: {
			return swap1(board);
		}
		case 2: {
			return swap2(board, R, C);
		}
		case 3: {
			return swap3(board, R, C);
		}
		case 4: {
			return swap4(board, R, C);
		}
		case 5: {
			return swap5(board, R, C);
		}
		case 6: {
			return swap6(board, R, C);
		}
		}
		return tmp;
	}

	private static int[][] swap1(int[][] board) {
		int R = board.length;
		int C = board[0].length;
		int[][] tmp = new int[R][C];

		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				tmp[(R - 1) - r][c] = board[r][c];
			}
		}
		return tmp;
	}

	private static int[][] swap2(int[][] board, int R, int C) {
		int[][] tmp = new int[R][C];

		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				tmp[r][(C - 1) - c] = board[r][c];
			}
		}

		return tmp;
	}

	private static int[][] swap3(int[][] board, int R, int C) {
		int[][] tmp = new int[C][R];// R 6 C 8

		for (int r = 0; r < R; r++) { // 0 - 5
			for (int c = 0; c < C; c++) { // 0 - 7
				tmp[c][(R - 1) - r] = board[r][c];
				/*
				 * 0 0 -> 0 5 0 1 -> 1 5 0 2 -> 2 5 0 7 -> 7 5
				 * 
				 * 1 0 -> 0 4 1 1 -> 1 4
				 */
			}
		}
		return tmp;
	}

	private static int[][] swap4(int[][] board, int R, int C) {
		int[][] tmp = new int[C][R];

		for (int r = 0; r < R; r++) { // 0-5
			for (int c = 0; c < C; c++) { // 0-7
				tmp[(C - 1) - c][r] = board[r][c];
			}
		}
		return tmp;
		/*
		 * board tmp 0 0 -> 5 0 0 1 -> 4 0 0 2 -> 3 0
		 * 
		 * 1 0 -> 5 1 1 1 -> 4 1 1 2 -> 3 1
		 */
	}

	private static int[][] swap5(int[][] board, int R, int C) {
		int[][] tmp = new int[R][C];

		for (int r = 0; r < R; r++) { // R: 6
			for (int c = 0; c < C; c++) { // C: 8
				if (r < R / 2) { // r=0,1,2
					if (c < C / 2) { // c=0,1,2,3
						tmp[r][c + C / 2] = board[r][c];

						/*
						 * 0 0 -> 0 4 0 1 -> 0 5
						 * 
						 * 3 0 -> 3 3 3 1 -> 3 4
						 */

					} else { // (r<R/2) && (c>=C/2)
						tmp[r + R / 2][c] = board[r][c];

						/*
						 * 0 4 -> 3 4 0 5 -> 4 5
						 */
					}
				}

				else { // r>=R/2
					if (c < C / 2) {
						tmp[r - R / 2][c] = board[r][c];
						/*
						 * 3 0 -> 0 0 3 1 -> 0 1
						 */
					} else { // (r>=R/2) && (c>=C/2)
						tmp[r][c - C / 2] = board[r][c];
						/*
						 * 3 4 -> 3 0 3 5 -> 3 1
						 */
					}
				}
			}
		}
		return tmp;
		// 배열 4개(arr1 ~ arr4)를 만들고 tmp에 합친다
		/*
		 * int[][] arr1 = new int[R/2][C/2]; int[][] arr2 = new int[R/2][C/2]; int[][]
		 * arr3 = new int[R/2][C/2]; int[][] arr4 = new int[R/2][C/2];
		 * 
		 * for(int r=0; r<R/2; r++) { // R = 6 for(int c=0; c<C/2; c++) { // C = 8
		 * tmp[r][] = arr1[r][]; } }
		 */
	}

	private static int[][] swap6(int[][] board, int R, int C) {
		int[][] tmp = new int[R][C];

		for (int r = 0; r < R; r++) { // R: 6
			for (int c = 0; c < C; c++) { // C: 8
				if (r < R / 2) {
					if (c < C / 2) {
						tmp[r + R / 2][c] = board[r][c];

						/*
						 * board tmp 0 0 -> 3 0 0 1 -> 3 1
						 */
					}

					else { // (r<R/2) && (c>=C/2)
						tmp[r][c - C / 2] = board[r][c];
						/*
						 * board tmp 0 4 -> 0 0 0 5 -> 0 1
						 */
					}
				}

				else { // r>=R/2
					if (c < C / 2) {
						tmp[r][c + C / 2] = board[r][c];
						/*
						 * 3 0 -> 3 4 3 1 -> 3 5
						 */
					} else { // (r>=R/2) && (c>=C/2)
						tmp[r - R / 2][c] = board[r][c];
						/*
						 * board tmp 3 4 -> 0 4 3 5 -> 0 5
						 */
					}
				}
			}
		}
		return tmp;
	}

	private static void print(int[][] board) {
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[r].length; c++) {
				System.out.print(board[r][c] + " ");
			}
			System.out.println();
		}
	}

}