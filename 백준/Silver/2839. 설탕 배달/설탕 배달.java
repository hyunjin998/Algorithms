import java.util.Scanner;

// 설탕 배달 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 설탕kg

		/*
		 * 1부터 30까지 최소봉지가 몇일지 계산해보았더니 규칙성을 찾을 수 있었는데
		 * 5로 나누었을 때 나머지가 1이나 3일 경우 최소봉지는 (N/5+1)개였고,
		 * 5로 나누었을 때 나머지가 2나 4일 경우 최소봉지는 (N/5+2)개였다.
		 */
		
		if (N == 4 || N == 7)
			System.out.println(-1);  // 정확하게 N킬로그램을 만들 수 없다면 -1 출력
		else if (N % 5 == 1 || N % 5 == 3)
			System.out.println(N / 5 + 1);
		else if (N % 5 == 2 || N % 5 == 4)
			System.out.println(N / 5 + 2);
		else // N%5 == 0
			System.out.println(N/5);
	}
}
