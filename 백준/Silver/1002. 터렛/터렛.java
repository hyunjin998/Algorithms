import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());
        for(int test_case=0; test_case<T; test_case++){
            st = new StringTokenizer(sc.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double d = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
            double overlap = Math.pow(Math.abs(r2-r1), 2);  // 두 원이 겹친다
            double notOverlap = Math.pow(r2+r1, 2);    // 겹치지 않는다

            int answer = 0;

            // 두 원이 똑같을 경우 => 무한대
            if(d == 0 && r1 == r2) answer = -1;

            // 한 원이 다른 원 안에 있는데 겹치지 않거나 두 원이 떨어져 있는 경우
            else if(d < overlap || d > notOverlap) answer = 0;

            // 두 원이 내부/외부에서 인접하는 경우
            else if(d == overlap || d == notOverlap) answer = 1;

            // 두 원의 인접점이 두 개일 경우
            else answer = 2;

            sb.append(answer).append('\n');
        } System.out.println(sb);
    }
}