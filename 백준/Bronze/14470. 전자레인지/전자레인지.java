import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(sc.readLine());  // 원래 고기 온도
        int B = Integer.parseInt(sc.readLine());  // 목표 온도
        int C = Integer.parseInt(sc.readLine());  // 얼어있는 고기를 데우는 시간
        int D = Integer.parseInt(sc.readLine());  // 얼어있는 고기를 해동하는 시간
        int E = Integer.parseInt(sc.readLine());  // 얼어있지 않은 고기를 데우는 시간

        int sum = (A<0 ? ((-A)*C + D + B*E) : (B-A)*E);
        System.out.println(sum);
    }
}