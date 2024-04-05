import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] sum = new int[N][M];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(sc.readLine());
			for(int j=0; j<M; j++) {
				sum[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(sc.readLine());
			for(int j=0; j<M; j++) {
				sum[i][j] += Integer.parseInt(st.nextToken());
				sb.append(sum[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);

	}

}