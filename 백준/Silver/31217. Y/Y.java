import java.io.*;
import java.util.*;

public class Main {
    static final long MOD = 1_000_000_000 + 7;
    static final long MOD_INV_OF_6 = 166_666_668;

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] number = new int[N + 1];

        // M개의 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(sc.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            number[u]++;
            number[v]++;
        }

        long answer = 0;

        // 각 정점에 대해 간선이 3개 이상인 경우 계산
        for (int i = 1; i <= N; i++) {
            if (number[i] >= 3) {
                long E = number[i];
                long numberOfY = (E * (E - 1) * (E - 2) % MOD) * MOD_INV_OF_6 % MOD;
                answer = (answer + numberOfY) % MOD;
            }
        } System.out.println(answer);
    }
}