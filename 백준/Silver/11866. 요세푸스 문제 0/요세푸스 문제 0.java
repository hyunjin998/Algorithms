import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

// 11866 요세푸스 문제0
public class Main {

	public static void main(String[] args) throws IOException {
		ArrayDeque <Integer> queue = new ArrayDeque<>();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			queue.offer(i);
		}
		
		sb.append('<');
		while(queue.size() > 1) {
			for(int i=0; i<K-1; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()).append(',').append(' ');
		}
		sb.append(queue.poll()).append('>');
		System.out.println(sb);

	}

}