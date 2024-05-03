

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2908 상수 
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		String num1 = "";
		String num2 = "";
		for(int i=a.length()-1; i>=0; i--) {
			num1 += a.charAt(i);
			num2 += b.charAt(i);
		}
		
		// check
		// System.out.println("num1: " + num1 + " num2: " + num2);
		
		int ans1 = Integer.parseInt(num1);
		int ans2 = Integer.parseInt(num2);
		int max = Math.max(ans1, ans2);
		System.out.println(max);
		
	}

}
