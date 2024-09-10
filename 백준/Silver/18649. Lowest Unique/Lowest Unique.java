import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = sc.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int m = Integer.parseInt(input[2]);

        int[] controlledMoves = new int[k];

        for (int round = 0; round < m; round++) {
            for (int i = 0; i < k; i++) {
                controlledMoves[i] = (i % 100) + 1;
            }

            for (int move : controlledMoves) {
                sb.append(move).append(" ");
            }
            sb.append("\n");
            System.out.print(sb.toString());
            sb.setLength(0);

            String[] remainingInput = sc.readLine().split(" ");
            for (int i = 0; i < n - k; i++) {
                int move = Integer.parseInt(remainingInput[i]);
            }
        }

        sc.close();
    }
}