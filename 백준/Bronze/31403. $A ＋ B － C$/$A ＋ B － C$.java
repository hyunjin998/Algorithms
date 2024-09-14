import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(sc.readLine());
        int B = Integer.parseInt(sc.readLine());
        int C = Integer.parseInt(sc.readLine());

        sb.append(A+B-C).append('\n');
        sb.append(Integer.parseInt(""+A+B)-C);
        System.out.println(sb);

    }
}