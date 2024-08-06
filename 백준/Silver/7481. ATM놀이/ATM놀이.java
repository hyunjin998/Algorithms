import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in), 1<<16);
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());
        for(int test_case=0; test_case<T; test_case++){
            StringTokenizer st = new StringTokenizer(sc.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            if (s == 0) {
                sb.append("0 0\n");
                continue;
            }

            if (a > s && b > s) {
                sb.append("Impossible\n");
                continue;
            }

            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int limit = s / max;
            boolean check = false;
            boolean[] visited = new boolean[min];

            for (int i = limit; !check && i >= 0; i--) {
                int remain = s - max * i;
                int mod = remain % min;

                if (visited[mod]) {
                    check = false;
                    break;
                }

                visited[mod] = true;
                if (mod != 0) continue;
                check = true;

                if (max == a) sb.append(i).append(' ').append(remain / min).append('\n');
                else sb.append(remain / min).append(' ').append(i).append('\n');
            }
            if (!check) sb.append("Impossible\n");
        } System.out.print(sb);
    }
}