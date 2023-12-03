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
		for(int test_case=1; test_case <= T; test_case++) {
			st = new StringTokenizer(sc.readLine());
			double avg = 0;
			for(int i=0; i<10; i++) {
				int num = Integer.parseInt(st.nextToken());
				avg += num;
			}
			avg = Math.round(avg/10);
			
			sb.append("#").append(test_case).append(" ").append((int)avg).append("\n");
		}
		System.out.println(sb);

	}

}