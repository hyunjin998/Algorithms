import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());

        for (int test_case=0; test_case<T; test_case++) {
            int N = Integer.parseInt(sc.readLine());
            int[][] dp = new int[2][N+1];
            int[][] array = new int[2][N+1];

            for (int i=0; i<2; i++) {
                st = new StringTokenizer(sc.readLine());
                for (int j=1; j<=N; j++) {
                    array[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][1] = array[0][1];
            dp[1][1] = array[1][1];

            for (int i=2; i<=N; i++) {
                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + array[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + array[1][i];
            }
            sb.append(Math.max(dp[0][N], dp[1][N])).append('\n');
        }
        System.out.println(sb);
    }
}