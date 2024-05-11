
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2908 상수 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = sc.readLine();

		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 56;
			// 0 - 3: 3
			// 4 - 6: 4
			// 7 - 9: 5
			if (27 <= num && num < 34) {
				num -= 1;
				num /= 3;
			}

			// Z일 경우 따로 처리
			else if (num == 34) {
				ans += 10;
				num = 0;
			}
			
			else {
				num /= 3;
			}
			
			ans += num;

		}
		System.out.println(ans);
	}
}