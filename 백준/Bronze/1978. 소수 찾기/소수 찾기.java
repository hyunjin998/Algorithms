
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sc.readLine());
		StringTokenizer st = new StringTokenizer(sc.readLine());

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			int ans = 0;
			
			// 1은 소수가 아님
			if (num == 1) {
				ans = 1;
			}

			// 2부터 num-1까지 돌았을때 나누어 떨어지는게 없으면 소수임
			for (int j = 2; j < num; j++) {
				// 나누어 떨어지면 소수가 아니므로 바로 반복문을 빠져 나간다
				if (num % j == 0) {
					ans = 1;
					break;
				}
				else continue;
			}
			
			// 나누어 떨어지는 수가 없었을 경우
			if (ans == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}