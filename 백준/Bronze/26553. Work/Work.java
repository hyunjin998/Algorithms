import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(sc.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(sc.readLine());
            int K = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            PaintHouse(K, P, X);
        } System.out.println(sb);
    }

    public static void PaintHouse(int K, int P, int X) {
        double minCost = Double.MAX_VALUE;
        int MRange = K*P/X + 1;

        for (int M = 1; M <= MRange; M++) {
            double cost = M*X + P*(K/(double)M);
            if (cost < minCost) minCost = cost;
        }
        double result = Math.round(minCost * 1000.0) / 1000.0;
        sb.append(String.format("%.3f", result)).append("\n");
    }
}