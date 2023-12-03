import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(sc.readLine());
		for(int test_case=1; test_case<=T; test_case++) {
			// 테스트케이스를 돌 때마다 sum은 0으로 초기화해준다
			int sum = 0;
			st = new StringTokenizer(sc.readLine());
			
			// 10개의 수를 입력 받는다 
			for(int i=0; i<10; i++) {
				int num = Integer.parseInt(st.nextToken());
				// 홀수만 더해준다
				if(num%2 != 0) sum += num;
			}
			sb.append("#").append(test_case).append(" ").append(sum).append("\n");
		}
		System.out.println(sb);

	}

}