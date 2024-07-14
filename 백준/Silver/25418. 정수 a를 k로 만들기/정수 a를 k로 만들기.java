import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] dp = new int[K+1];
        Arrays.fill(dp, 1000001);
        dp[A] = 0;
        
        for(int i=A+1; i<=K; i++){
            dp[i] = dp[i-1];
            if(i%2 == 0 && dp[i] > dp[i/2]) {
                dp[i] = dp[i/2];
            } dp[i] ++;
        } System.out.println(dp[K]);
    }
}