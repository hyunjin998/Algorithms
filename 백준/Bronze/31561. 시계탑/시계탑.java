import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(sc.readLine());
        double answer = 0;

        answer = (M <= 30.0 ? M/2.0 : (double)M * 3.0/2.0 - 30.0);
        System.out.printf("%.1f", answer);
    }
}