

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 2787 대표값2 
public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[5];
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			array[i] = Integer.parseInt(sc.readLine());
			sum += array[i];
		}
		Arrays.sort(array);
		System.out.println(sum / array.length);
		System.out.println(array[2]);
	}


}