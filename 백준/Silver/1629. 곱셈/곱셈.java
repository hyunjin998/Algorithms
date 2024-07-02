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
        int C = Integer.parseInt(st.nextToken());

        System.out.println(Power(A, B, C));
    }

    private static long Power(int A, int B, int C) {
        if(B == 1) return A % C;

        long answer = Power(A, B/2, C);
        answer = answer * answer % C;

        if(B%2 != 0) answer = answer * (A % C) % C;
        return answer;
    }
}