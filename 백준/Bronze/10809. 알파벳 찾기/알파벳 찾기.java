
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = sc.readLine();
		StringBuilder sb = new StringBuilder();
		
		int[] Array = new int[26];
		Arrays.fill(Array, -1);
		
		for(int i=0; i<str.length(); i++) {
			if(Array[str.charAt(i)-97] == -1) {
				Array[str.charAt(i)-97] = i;
			}
		}

		for(int i=0; i<Array.length; i++) {
			sb.append(Array[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}