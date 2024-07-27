import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String str = sc.readLine();

        int len = str.length();
        int max = 0;

        for(int n=1; n <= len/2; n++) {
            for (int i=0; i <= len-2*n; i++) {
                int left = 0;
                int right = 0;

                for (int j=i; j < i+n; j++) {
                    left += str.charAt(j) - '0';
                }

                for (int j = i+n; j < i+2*n; j++) {
                    right += str.charAt(j) - '0';
                }

                if (left == right) max = Math.max(max, 2 * n);
            }
        } System.out.println(max);
    }
}