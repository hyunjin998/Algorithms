import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int answer = 0;
		int[] dp = new int[18259];
		
		dp[0] = 1;
		dp[1] = dp[0] + 6;
		
		if(N <= 7) {
			if(N == 1) answer = 1;
			else answer = 2;
		}
		else {
			for(int i=2; N > dp[i-1]; i++) {
				dp[i] = dp[i-1] + 6*i;
				answer = i;
			}
			answer += 1;
		}
		System.out.println(answer);
	}

}