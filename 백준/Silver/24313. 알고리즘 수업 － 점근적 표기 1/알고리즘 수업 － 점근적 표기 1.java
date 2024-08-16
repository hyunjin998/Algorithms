import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(sc.readLine());
        int n = Integer.parseInt(sc.readLine());

        int answer = ((a1 <= c && a1 * n + a0 <= c * n) ? 1 : 0);
        System.out.println(answer);
    }
}