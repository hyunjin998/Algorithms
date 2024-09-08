import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        StringBuilder[] nums = new StringBuilder[2];
        nums[0] = new StringBuilder(); // 홀수
        nums[1] = new StringBuilder(); // 짝수

        for (int i = 1; i <= N; ++i) {
            st = new StringTokenizer(sc.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int group = (x + y) % 2;
            if (nums[group].length() > 0) {
                nums[group].append(' ');
            }
            nums[group].append(i);
        }

        if (nums[0].length() == 0 || nums[1].length() == 0) System.out.println("NO");
        else {
            System.out.println("YES");
            System.out.println(nums[0] + " " + nums[1]);
        }
    }
}