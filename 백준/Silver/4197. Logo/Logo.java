import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine()); // 테스트 케이스의 수

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(sc.readLine()); // 명령어의 수

            double x = 0, y = 0; // 시작 위치
            double angle = 0; // 현재 방향 (각도)

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(sc.readLine());
                String command = st.nextToken();
                int value = Integer.parseInt(st.nextToken());

                switch (command) {
                    case "fd": // 앞으로 이동
                        x += value * Math.cos(Math.toRadians(angle));
                        y += value * Math.sin(Math.toRadians(angle));
                        break;
                    case "bk": // 뒤로 이동
                        x -= value * Math.cos(Math.toRadians(angle));
                        y -= value * Math.sin(Math.toRadians(angle));
                        break;
                    case "lt": // 왼쪽으로 회전
                        angle += value;
                        break;
                    case "rt": // 오른쪽으로 회전
                        angle -= value;
                        break;
                }
            }

            // 시작 위치에서 현재 위치까지의 거리를 계산하고 반올림
            int distance = (int) Math.round(Math.sqrt(x * x + y * y));
            System.out.println(distance);
        }
    }
}