import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 15651 N과 M(3)
public class Main {
	static int[] arr;  // 원본배열
	static int[] sel;  // 선택배열
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
			
		arr = new int[N];
		sel = new int[M];
		
		// 원본배열 채우기
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// check
		// System.out.println(Arrays.toString(arr));
		recursive(0);
		System.out.println(sb);
	}
	
	
	private static void recursive(int k) {
		// basis part
		if(k==sel.length) {  // 선택배열이 꽉 찬다면
			for(int j=0; j<sel.length; j++) {
				sb.append(sel[j]).append(" ");
				// System.out.print(sel[j] + " ");
			}
			sb.append("\n");
			// System.out.println();
			return;
		}
		
		
		// inductive part
		for(int i=0; i<arr.length; i++) {
			sel[k] = arr[i];
			recursive(k+1);
		}
		
	}
	
	

}