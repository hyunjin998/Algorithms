import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sc.readLine());
        double[] dp = new double[N+1];
        double max = 0;

        for(int i=1; i<=N; i++){
            double num = Double.parseDouble(sc.readLine());
            dp[i] = Math.max(num, dp[i-1] * num);
            max = Math.max(max, dp[i]);
        } System.out.printf("%.3f", max);
    }
}