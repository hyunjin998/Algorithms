import java.util.Scanner;

// 쿼드 트리 
public class Main {

	public static int[][] Array;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 영상의 크기
		Array = new int[N][N]; // 영상의 크기만큼의 이차원 배열 선언

		/*
		 * 영역에 0과 1이 모두 있으면
		 * 왼쪽위, 오른쪽위, 왼쪽아래, 오른쪽아래 쪼개서 보는것 반복
		 */

		for (int i = 0; i < N; i++) {
			String str = sc.next(); // 11110000
			for (int j = 0; j < N; j++) {
				// str의 요소를 하나씩 정수로 변환해 배열 Array[i][j]에 저장
				Array[i][j] = str.charAt(j) - '0';
				// System.out.print(Array[i][j]);
			}
		}

		isQuadTree(0, 0, N); // Array[0,0], 영상의 크기
		System.out.println(sb);
	}

	private static void isQuadTree(int x, int y, int size) {
		// 숫자가 같으면
		if (isPossible(x, y, size)) {
			sb.append(Array[x][y]);
			return;
		}

		// else {
		int size2 = size / 2; // 숫자가 다르면 절반 나누기

		sb.append("(");

		isQuadTree(x, y, size2); // 왼쪽 위
		isQuadTree(x, y + size2, size2); // 오른쪽 위
		isQuadTree(x + size2, y, size2); // 왼쪽 아래
		isQuadTree(x + size2, y + size2, size2); // 오른쪽 아래

		sb.append(")");
		// }
	}

	public static boolean isPossible(int x, int y, int size) {
		int num = Array[x][y];

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (num != Array[i][j]) return false; // 다른 숫자 발견
			}
		}
		return true;
	}
}

