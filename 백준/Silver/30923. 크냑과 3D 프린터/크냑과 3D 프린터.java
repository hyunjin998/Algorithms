import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(sc.readLine());
        int[] heights = new int[N];
        st = new StringTokenizer(sc.readLine());

        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 2L * N;  // 윗면 + 밑면
        for (int i = 0; i < N; i++) {
            sum += 2L * heights[i];  // 앞면 + 뒷면
        }

        // 첫 번째 막대 옆면 + 마지막 막대 옆면
        sum += heights[0] + heights[N - 1];
        // 겹치는 옆면
        for (int i = 1; i < N; i++) {
            sum += Math.abs(heights[i] - heights[i - 1]);
        }

        System.out.println(sum);
    }
}