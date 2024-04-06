import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2566 최댓값 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][] array = new int[10][10];
		
		int max = 0;
		int x = 0;
		int y = 0;
		
		for(int i=1; i<10; i++) {
			st = new StringTokenizer(sc.readLine());
			for(int j=1; j<10; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
				
				if(max < array[i][j]) {
					max = array[i][j];
					x = i;
					y = j;
				}
			}
		}

		System.out.println(max);
		if (max == 0) System.out.println("1 1");
		else System.out.println(x + " " + y);
		
	}

}