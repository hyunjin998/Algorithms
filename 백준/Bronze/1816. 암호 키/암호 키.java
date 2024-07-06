import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(sc.readLine());

        for(int i=0; i<N; i++) {
            long num = Long.parseLong(sc.readLine());
            for (int j = 2; j <= 1000000; j++) {
                if (num % j == 0) {
                    sb.append("NO").append("\n");
                    break;
                }

                if(j == 1000000){
                    sb.append("YES").append("\n");
                    break;
                }
            }
        } System.out.println(sb);
    }
}