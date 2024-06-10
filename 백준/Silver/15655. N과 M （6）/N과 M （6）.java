
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] array;  // 원본배열 
	static int[] sel;  // 선택배열 
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		array = new int[N];
		sel = new int[M];
		
		st = new StringTokenizer(sc.readLine());
		
		// array에 값 넣기 
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		recursive(0, 0);
	}

	private static void recursive(int idx, int k) {
		// basis part
		if(k==sel.length) {
			for(int j=0; j<sel.length; j++) {
				System.out.print(sel[j] + " ");
			}
			System.out.println();
			return;
		}
		
		
		// inductive part
		for(int i=idx; i<array.length; i++) {
			sel[k] = array[i];
			recursive(i+1, k+1);
		}
		
	}
	
}