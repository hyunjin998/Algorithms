

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1427 소트인사이드 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = sc.readLine();
		int[] array = new int[str.length()];  // N <= 1000000000
		
		for(int i=0; i<array.length; i++) {
			array[i] = str.charAt(i) - '0';
		}
		
		Arrays.sort(array);
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}
		

	}

}
