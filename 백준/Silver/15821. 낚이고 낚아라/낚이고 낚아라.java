import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        double[] maxDistances = new double[N];

        for (int i = 0; i < N; i++) {
            int P = Integer.parseInt(sc.readLine().trim());
            double maxDistance = 0;

            st = new StringTokenizer(sc.readLine());
            for (int j = 0; j < P; j++) {
                int x = Integer.parseInt(st.nextToken().trim());
                int y = Integer.parseInt(st.nextToken().trim());
                maxDistance = Math.max(maxDistance, x * x + y * y);
            } maxDistances[i] = maxDistance;
        }

        double left = 0;
        double right = 1e10;

        while (right - left > 1e-6) {
            double mid = (left + right) / 2;
            if (isValid(mid, maxDistances, K)) right = mid;
            else left = mid;
        } System.out.printf("%.2f\n", right * right);
    }

    private static boolean isValid(double mid, double[] maxDistances, int K) {
        int count = 0;
        double radiusSquared = mid * mid;
        for (double distance : maxDistances) {
            if (distance <= radiusSquared) count++;
        } return count >= K;
    }
}