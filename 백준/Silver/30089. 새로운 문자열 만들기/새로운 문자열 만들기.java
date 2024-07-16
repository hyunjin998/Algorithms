import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String S = br.readLine().trim();
            String X = createString(S);
            sb.append(X).append("\n");
        } System.out.print(sb);
    }

    private static String createString(String S) {
        int n = S.length();
        String reversedS = new StringBuilder(S).reverse().toString();

        for (int i = 0; i < n; i++) {
            if (S.substring(i).equals(reversedS.substring(0, n - i)))
                return S + reversedS.substring(n - i);
        } return S + reversedS;
    }
}