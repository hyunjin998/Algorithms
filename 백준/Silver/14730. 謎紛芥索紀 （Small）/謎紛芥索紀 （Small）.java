import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(sc.readLine());
        int sum = 0;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(sc.readLine());

            int C = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            sum += C*K;
        } System.out.println(sum);
    }
}