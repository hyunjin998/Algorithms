
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
// 1259 팰린드롬수 
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		String str2 = "";
		String quit = "0";
		while(!str.equals(quit)) {
			str2 = "";
			str = sc.readLine();
			if(str.equals("0")) break;
			for(int i=str.length()-1; i>=0; i--) {
				str2 += str.charAt(i);
			}
			
			if(str.equals(str2)) {
				System.out.println("yes");
			}
			else System.out.println("no");
		}

	}

}
