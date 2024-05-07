import java.util.Scanner;

public class Main {
	// 구간합구하기4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수의 갯수
		int M = sc.nextInt(); // 합을 구해야 하는 횟수

		// N+1해서 0자리를 만들어, outOFindex를 없앤다.
		int[] Array = new int[N + 1]; // N 크기의 배열 Array 선언
		Array[0] = 0;

		for (int i = 1; i <= N; i++) {
			Array[i] = Array[i - 1] + sc.nextInt();
		}
		
		// 합을 구해야 하는 횟수
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(Array[b] - Array[a-1]);
		}
	}
}
