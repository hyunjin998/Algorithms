
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
// 8958 OX퀴즈 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int T = Integer.parseInt(sc.readLine());
		for (int test_case = 0; test_case < T; test_case++) {
			str = sc.readLine();
			int total = 0;
			int con = 0; // continue
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == 'O') {
					con++;
					total += con;
				}
				
				else con = 0;
				
			}
			System.out.println(total);
		}

	}

}
