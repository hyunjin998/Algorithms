import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] dp = new int[1001];
        dp[0] = 0;
        int idx = 1;

        for(int i=0; idx<1001; i++){
            for(int j=0; j<i; j++){
                dp[idx] = dp[idx-1] + i;
                idx++;
                if(idx > 1000) break;
            }
        } System.out.println(dp[B]-dp[A-1]);
    }
}