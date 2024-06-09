import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 15652 N과 M(4)
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
		
		// 원본배열 값 채우기
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		// check
		// Arrays.toString(arr);
		
		recursive(0, 0);
		System.out.println(sb);

	}

	// idx는 그냥 i의 초기값을 위해 존재
	private static void recursive(int idx, int k) {
		// basis part
		if(k==sel.length) {
			for(int j=0; j<sel.length; j++) {
				sb.append(sel[j]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		
		// inductive part
		for(int i=idx; i<arr.length; i++) {
			sel[k] = arr[i];
			recursive(i, k+1);
		}
		
	}
	/*
	 * 단순한 중복조합 문제
	 */
	
}