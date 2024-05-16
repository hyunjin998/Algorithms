

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 9375 패션왕 신해빈 
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(sc.readLine());
		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(sc.readLine());
			HashMap<String, Integer> hash = new HashMap<>();
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(sc.readLine());
				st.nextToken();
				String type = st.nextToken();
				

				/*
				 * 해쉬맵에 해당 타입이 있으면 +1
				 * 없으면 1값 넣어주기
				 */
				
				if (hash.containsKey(type))
					hash.put(type, hash.get(type) + 1);
				else
					hash.put(type, 1);
			}
			
				int ans = 1;
				for (int j : hash.values()) {
					ans *= (j + 1);
				}
				sb.append(ans - 1).append("\n");
		}
		System.out.println(sb);

	}

}
