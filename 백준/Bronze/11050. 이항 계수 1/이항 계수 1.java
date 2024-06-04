import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11050 이항 계수 1
public class Main {
	
	static int cnt = 0;
	static int[] sel;
	static int N;
	static int K;
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		sel = new int[K];
		
		recursive(0, 0);
		System.out.println(cnt);
	}

	private static void recursive(int n, int k) {
		// basis part
		if(k==sel.length) {
			cnt++;
			return;
		} 		
		
		// inductive part
		for(int i = n; i<N; i++) {
			sel[k] = i;
			recursive(i+1, k+1);
		}
		
	}

}