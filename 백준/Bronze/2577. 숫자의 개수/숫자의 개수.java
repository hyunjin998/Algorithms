
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2577 숫자의 개수 
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(sc.readLine());
		int B = Integer.parseInt(sc.readLine());
		int C = Integer.parseInt(sc.readLine());
		int total = A * B * C;
		String str = Integer.toString(total);
		
		int[] array = new int[10];  // 0 ~ 9
		for(int i=0; i<str.length(); i++) {
			int j = str.charAt(i)-'0';
			array[j] += 1;
		}
		
		// print
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
