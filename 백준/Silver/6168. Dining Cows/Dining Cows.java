import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(sc.readLine());
        int[] cows = new int[N];

        for (int i = 0; i < N; i++) {
            cows[i] = Integer.parseInt(sc.readLine());
        }

        // 왼쪽에서 1로 바꾸는 경우와 오른쪽에서 2로 바꾸는 경우의 최소값을 찾음
        int[] leftToRight = new int[N + 1];
        int[] rightToLeft = new int[N + 1];

        // 왼쪽에서 오른쪽으로 가면서 2의 개수를 누적
        for (int i = 1; i <= N; i++) {
            leftToRight[i] = leftToRight[i - 1] + (cows[i - 1] == 2 ? 1 : 0);
        }

        // 오른쪽에서 왼쪽으로 가면서 1의 개수를 누적
        for (int i = N - 1; i >= 0; i--) {
            rightToLeft[i] = rightToLeft[i + 1] + (cows[i] == 1 ? 1 : 0);
        }

        // 최소 변경 횟수를 찾음
        int minChanges = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            minChanges = Math.min(minChanges, leftToRight[i] + rightToLeft[i]);
        }

        System.out.println(minChanges);
    }
}