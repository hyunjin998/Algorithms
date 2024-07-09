import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] maxDistances = new long[N];

        for (int i = 0; i < N; i++) {
            long maxDistance = 0;
            int P = Integer.parseInt(br.readLine().trim());

            st = new StringTokenizer(br.readLine().trim());
            while (P-- > 0) {
                long x = Long.parseLong(st.nextToken().trim());
                long y = Long.parseLong(st.nextToken().trim());
                long distanceSquared = x * x + y * y;
                maxDistance = Math.max(maxDistance, distanceSquared);
            }

            maxDistances[i] = maxDistance;
        }

        Arrays.sort(maxDistances);
        long result = maxDistances[K - 1];

        System.out.printf("%d.00\n", result);
    }
}