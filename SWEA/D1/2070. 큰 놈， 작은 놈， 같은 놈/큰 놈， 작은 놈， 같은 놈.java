import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(sc.readLine());
		for(int test_case=1; test_case<=T; test_case++) {
			st = new StringTokenizer(sc.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			String ans = "";
			if(num1 < num2) ans = "<";		
			else if(num1 == num2) ans = "=";
			else ans = ">";  // num1 > num2
			
			
			
			sb.append("#").append(test_case).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);

	}

}