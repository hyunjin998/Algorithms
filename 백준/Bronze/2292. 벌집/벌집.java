import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sc.readLine());

        int answer = 0;
        int[] dp = new int[18259];

        dp[0] = 1;
        dp[1] = dp[0] + 6;

        if(N > 7) {
            for(int i=2; N > dp[i-1]; i++) {
                dp[i] = dp[i-1] + 6*i;
                answer = i;
            } answer += 1;
        } else answer = (N==1 ? 1 : 2);

        System.out.println(answer);
    }
}