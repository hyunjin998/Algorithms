import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(sc.readLine());
            int[] bowls = new int[4];
            for (int i = 0; i < 4; i++) {
                bowls[i] = Integer.parseInt(st.nextToken());
            }

            // 종료 조건
            if (bowls[0] == 0 && bowls[1] == 0 && bowls[2] == 0 && bowls[3] == 0) {
                break;
            }

            while (true) {
                // 최소값 찾기
                int min = Integer.MAX_VALUE;
                int minIndex = -1;
                for (int i = 0; i < 4; i++) {
                    if (bowls[i] > 0 && bowls[i] < min) {
                        min = bowls[i];
                        minIndex = i;
                    }
                }

                // 최소값을 제외한 모든 그릇에서 최소값만큼 빼기
                for (int i = 0; i < 4; i++) {
                    if (i != minIndex && bowls[i] > 0) {
                        bowls[i] -= min;
                    }
                }

                // 남은 그릇이 하나인지 확인
                int nonEmptyCount = 0;
                int lastMarbles = 0;
                for (int i = 0; i < 4; i++) {
                    if (bowls[i] > 0) {
                        nonEmptyCount++;
                        lastMarbles = bowls[i];
                    }
                }

                if (nonEmptyCount == 1) {
                    sb.append(lastMarbles).append('\n');
                    break;
                }
            }
        }

        System.out.print(sb);
    }
}