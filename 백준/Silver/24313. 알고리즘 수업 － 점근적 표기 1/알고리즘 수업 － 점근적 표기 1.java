import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        int[] fn = new int[2];

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(sc.readLine());
        int n0 = Integer.parseInt(sc.readLine());

        boolean isBigO = true;

        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                isBigO = false;
                break;
            }
        }

        System.out.println(isBigO ? 1 : 0);
    }
}