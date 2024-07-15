import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());

        for(int test_case=0; test_case<T; test_case++) {
            st = new StringTokenizer(sc.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(LCM(A, B)).append("\n");
        } System.out.println(sb);
    }

    static int GCD(int A, int B) {
        if (A < B) {
            int tmp = A;
            A = B;
            B = tmp;
        }

        while (B != 0) {
            int r = A % B;
            A = B;
            B = r;
        }
        return A;
    }

    public static int LCM(int A, int B) {
        return (A * B) / GCD(A, B);
    }
}