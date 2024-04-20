

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
// 1697 숨바꼭질
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		int N = Integer.parseInt(st.nextToken());  // 5
		int K = Integer.parseInt(st.nextToken());  // 17

		// 수빈이랑 동생이 같은 곳에 있을 경우 0을 출력하고 함수 종료 
		if(N == K) {
			System.out.println(0);
			return;
		}
		
		// N의 최댓값은 100,000이기 때문에 크기가 100,001인 boolean 타입의 방문배열 선언
		boolean[] visited = new boolean[100001]; 
		Queue <Integer> queue = new LinkedList<>();
		
		queue.offer(N);  // 수빈이의 위치를 큐에 넣는다.
		int cnt = 0;  // 수빈이가 동생을 찾는데 걸리는 시간
	
		while(!queue.isEmpty()) {  // queue가 빌때까지
			cnt++;  // 시간++
			int size = queue.size();
			for(int i=0; i<size; i++) {
				int x = queue.poll();  // queue에 있는 값을 꺼낸다
				visited[x] = true;  // 방문 완료
				
				// 수빈이와 수빈이 동생이 만났을 경우
				if((x-1 == K) || (x+1 == K) || (x*2 == K)) {
					System.out.println(cnt);
					return;
				}
				
				
				// x-1이 0보다 크고 아직 방문하지 않았을 때
				if(x-1 >= 0 && !visited[x-1]) {
					visited[x-1] = true;  // 방문처리 해주고
					queue.offer(x-1);  // x-1을 넣는다
				}
				
				// x+1이 100,000보다 작고 아직 방문하지 않았을 때
				if(x+1 <= 100000 && !visited[x+1]) {
					visited[x+1] = true;  // 방문처리 해주고
					queue.offer(x+1);  // x+1을 넣는다
				}
				
				// x*2가 100,000보다 작고 아직ㅁ 방문하지 않았을 때
				if(x*2 <= 100000 && !visited[x*2]) {
					visited[x*2] = true;  // 방문처리 해주고
					queue.offer(x*2);  // x*2를 넣는다
				}
			}
		}
		System.out.println(cnt);
	}

}
