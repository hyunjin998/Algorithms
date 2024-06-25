
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 10798 세로읽기 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[][] array = new char[5][15];  // 최대 15개의 글자가 들어옴 
		
		for(int i=0; i<5; i++) {
			String str = sc.readLine();
			for(int j=0; j<str.length(); j++) {
				array[i][j] = str.charAt(j);
			}
			
		}
		// check
		// System.out.println(Arrays.deepToString(array));
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(array[j][i] == '\0') continue;
				sb.append(array[j][i]);
			}
		}
		System.out.println(sb);
	}

}
