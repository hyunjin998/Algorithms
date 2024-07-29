import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());
        for(int test_case=0; test_case<T; test_case++){
            int m1 = Integer.parseInt(sc.readLine());
            for(int i=0; i<m1; i++) sc.readLine();
            int m2 = Integer.parseInt(sc.readLine());
            for(int j=0; j<m2; j++) sc.readLine();

            String answer = (m1 == m2 ? "yes" : "no");
            sb.append(answer).append('\n');

        } System.out.println(sb);
    }
}