
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[][]array = new int[101][101];  // 도화지의 크기는 가로, 세로 크기가 각각 100 
		
		int T = Integer.parseInt(sc.readLine());
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(sc.readLine());
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			
			for(int w =W; w<W+10; w++) {
				for(int h=H; h<H+10; h++) {
					array[w][h] = 1;
				}
			}
		}
		
		// count 1
		int cnt = 0;
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				if(array[i][j] == 1) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
