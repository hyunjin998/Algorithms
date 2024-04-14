import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1003 피보나치 함수  
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(sc.readLine());
		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(sc.readLine());

			int[][] dp = new int[41][41];

			dp[0][0] = 1;
			dp[0][1] = 0;
			dp[1][0] = 0;
			dp[1][1] = 1;

			for(int i=2; i<=N; i++) {
				dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
				dp[i][1] = dp[i - 1][0] + dp[i - 1][1];
			}

			sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");

		}
		System.out.println(sb);

	}

}