

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1107 리모컨 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String n = sc.readLine();
		int N = Integer.parseInt(n);
		int M = Integer.parseInt(sc.readLine()); // 반복문의 횟수
		boolean[] array = new boolean[10];
		Arrays.fill(array, true);

		// 고장난 버튼이 있을 경우에만 받으면 된다 
		if(M != 0) {
			st = new StringTokenizer(sc.readLine());
			for(int i=0; i<M; i++) {
				int idx = Integer.parseInt(st.nextToken());
				array[idx] = false;  // 고장난 버튼은 false 처리 
			}			
		}
				
		// 고장난 버튼이 없을 경우 n의 길이를 리턴하고 종료
//		if(M == 0) {
//			if(N == 100) {
//				System.out.println("0");
//				return;
//			}
//			else {				
//				System.out.println(n.length());
//				return;
//			}
//		}
				
		int ans = Math.abs(N - 100);
		for(int i=0; i<=999999; i++) {
			String str = String.valueOf(i);
			int len = str.length();
			
			boolean Break = true;
			for(int j=0; j<len; j++) {
				if(!array[str.charAt(j) - '0']) {
					Break = false;
					break;
				}
			}
			if(Break) {
				int min = Math.abs(N - i) + len;
				ans = Math.min(min, ans);
			}
		}
		System.out.println(ans);
		
	}

}
