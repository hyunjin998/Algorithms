
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
// 15650 N과 M(2) 
	static int N;  // 원본배열 인덱스 
	static int M;  // 선택배열 인덱스 
	static int[] arr;  // 원본배열 
	static int[] sel;  // 선택배열 
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		sel = new int[M];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		recursive(0, 0);
	}

	private static void recursive(int idx, int k) {
		// basis part
		if(k==sel.length) {
			for(int j=0; j<sel.length; j++) {
				if(j == sel.length-1) {
					System.out.print(sel[j]);
				}
				else System.out.print(sel[j] + " ");
				// System.out.println(sel[j]);
				// System.out.println(Arrays.toString(sel));
			}
			System.out.println();
			return;
		}
		
		// inductive part
		for(int i=idx; i<arr.length; i++) {
			sel[k] = arr[i];
			recursive(i+1, k+1);
		}
		
	}

	/*
	 * 조합 
	 */
}
