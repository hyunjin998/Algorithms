import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 11차원 좌표의 초기 값을 0으로 설정
        int[] result = new int[11];

        // 2047개의 좌표를 읽어들임
        for (int i = 0; i < 2047; i++) {
            st = new StringTokenizer(sc.readLine());
            for (int j = 0; j < 11; j++) {
                result[j] ^= Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 11; i++) {
            sb.append(result[i]).append(' ');
        }

        System.out.println(sb);
    }
}