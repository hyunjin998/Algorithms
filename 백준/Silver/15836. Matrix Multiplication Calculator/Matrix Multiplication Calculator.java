import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseNumber = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(sc.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());

            if (M == 0 && N == 0 && P == 0 && Q == 0) break;

            sb.append("Case #").append(caseNumber).append(":\n");

            // matrix A
            int[][] A = new int[M][N];
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(sc.readLine().trim());
                for (int j = 0; j < N; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // matrix B
            int[][] B = new int[P][Q];
            for (int i = 0; i < P; i++) {
                st = new StringTokenizer(sc.readLine().trim());
                for (int j = 0; j < Q; j++) {
                    B[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            if (N != P) {
                sb.append("undefined\n");
            } else {
                int[][] C = new int[M][Q];
                for (int i = 0; i < M; i++) {
                    for (int j = 0; j < Q; j++) {
                        int sum = 0;
                        for (int k = 0; k < N; k++) {
                            sum += A[i][k] * B[k][j];
                        }
                        C[i][j] = sum;
                    }
                }

                for (int i = 0; i < M; i++) {
                    sb.append("| ");
                    for (int j = 0; j < Q; j++) {
                        sb.append(C[i][j]).append(" ");
                    } sb.append("|\n");
                }
            } caseNumber++;
        }
        System.out.print(sb);
    }
}