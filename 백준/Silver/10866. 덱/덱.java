import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 10866 덱 
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sc.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		int num = 0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(sc.readLine());
			String str = st.nextToken();
			
			switch(str) {
			case "push_front" : {
				num = Integer.parseInt(st.nextToken());
				deque.offerFirst(num);
				break;
			}
			
			case "push_back": {
				num = Integer.parseInt(st.nextToken());
				deque.offerLast(num);
				break;
			}
			
			case "pop_front": {
				if(deque.isEmpty()) sb.append(-1).append("\n");
				else {
					num = deque.pollFirst();
					sb.append(num).append("\n");
				}
				break;
			}
			
			case "pop_back":{
				if(deque.isEmpty()) sb.append(-1).append("\n");
				else {
					num = deque.pollLast();
					sb.append(num).append("\n");
				}
				break;
			}
			
			case "size": {
				sb.append(deque.size()).append("\n");
				break;
			}
			
			case "empty": {
				if(deque.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
				break;
			}
			
			case "front": {
				if(deque.isEmpty()) sb.append(-1).append("\n");
				else {
					num = deque.peekFirst();
					sb.append(num).append("\n");
				}
				break;
			}
			
			case "back": {
				if(deque.isEmpty()) sb.append(-1).append("\n");
				else {
					num = deque.peekLast();
					sb.append(num).append("\n");
				}
				break;
			}
			
			
			}
		}
		System.out.println(sb);
	}

}