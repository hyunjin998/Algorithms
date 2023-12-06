import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(sc.readLine());
		for(int test_case=1; test_case<=T; test_case++) {
			int max = 0;  // 테스트케이스를 돌 때마다 초기화

			st = new StringTokenizer(sc.readLine());
			for(int i=0; i<10; i++) {
				int num = Integer.parseInt(st.nextToken());
				// max와 num 중 더 큰 값을 max에 대입한다
				max = Math.max(max, num);
			}
			
			sb.append("#").append(test_case).append(" ").append(max).append("\n");
		}
		System.out.println(sb);

	}

}