import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(sc.readLine());
        double answer = 0;

        if(M > 30) {
            M -= 30;
            answer = (double)M * 3 / 2 + 15;
        } else answer = (double)M/2;

        System.out.printf("%.1f", answer);
    }
}