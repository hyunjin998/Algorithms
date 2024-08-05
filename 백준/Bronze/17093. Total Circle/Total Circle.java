import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] P = new int[N][2];
        int[][] Q = new int[M][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(sc.readLine());
            P[i][0] = Integer.parseInt(st.nextToken());
            P[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(sc.readLine());
            Q[i][0] = Integer.parseInt(st.nextToken());
            Q[i][1] = Integer.parseInt(st.nextToken());
        }

        long maxDistanceSquared = 0;

        for (int i = 0; i < M; i++) {
            int qx = Q[i][0];
            int qy = Q[i][1];
            long maxDistanceForThisQ = 0;

            for (int j = 0; j < N; j++) {
                int px = P[j][0];
                int py = P[j][1];

                long dx = px - qx;
                long dy = py - qy;
                long distanceSquared = dx * dx + dy * dy;

                if (distanceSquared > maxDistanceForThisQ) {
                    maxDistanceForThisQ = distanceSquared;
                }
            }

            if (maxDistanceForThisQ > maxDistanceSquared) {
                maxDistanceSquared = maxDistanceForThisQ;
            }
        }

        System.out.println(maxDistanceSquared);
    }
}