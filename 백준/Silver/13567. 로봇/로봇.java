import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int x = 0;
		int y = 0;
		
		// 우, 상, 좌, 하  
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		int vector = 0;
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			String type = st.nextToken();
			int value = Integer.parseInt(st.nextToken());
			
			if (type.equals("MOVE")) {
				x += dx[vector] * value;
				y += dy[vector] * value;
				
				if (x < 0 || x > M || y < 0 || y > M) {
					System.out.println(-1);
					return;
				}
					
			} else {
				if (value == 0) {
					vector++;
					if (vector > 3) {
						vector = 0;
					}
				} else {
					vector--;
					if (vector < 0) {
						vector = 3;
					}
				}
			}
		}
	
		System.out.println(x + " " + y);
 	}
}