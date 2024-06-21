import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// 11723 집합
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int M = Integer.parseInt(sc.readLine());
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(sc.readLine());
			String opt = st.nextToken();
			int num;
			
			switch(opt) {
			case "add": {
				num = Integer.parseInt(st.nextToken());
				set.add(num);
				break;
			}
			
			case "remove": {
				num = Integer.parseInt(st.nextToken());
				set.remove(num);
				break;
			}
			
			case "check": {
				num = Integer.parseInt(st.nextToken());
				if(set.contains(num)) {
					sb.append(1).append("\n");
				}
				else sb.append(0).append("\n");
				break;
			}
			
			case "toggle": {
				num = Integer.parseInt(st.nextToken());
				if(set.contains(num)) {
					set.remove(num);
				}
				else set.add(num);
				break;
			}
			
			case "all": {
				set.clear();
				for (int j=1; j<=20; j++) {
					set.add(j);
				}
				break;
			}
			
			case "empty": {
				set.clear();
				break;
			}
			}
		}
		System.out.println(sb);

	}

}