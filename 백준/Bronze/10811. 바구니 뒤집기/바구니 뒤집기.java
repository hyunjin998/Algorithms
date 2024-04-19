
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
// 10811 바구니 뒤집기
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		int N = Integer.parseInt(st.nextToken());  // 5, 바구니 갯수
		int M = Integer.parseInt(st.nextToken());  // 4, 반복문
		int[] Array = new int[N+1];
		int[] tmp = new int[N+1];
		
		// 배열 Array에 인덱스에 해당하는 값 넣기
		for(int i=0; i<N+1; i++) {
			Array[i] = i;
			tmp[i] = i;
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(sc.readLine());
			int start = Integer.parseInt(st.nextToken());  // 1
			int end = Integer.parseInt(st.nextToken());  // 2
			
			// 이제 Array 값을 바꿔줄건데 바꾸기 전에 배열 tmp에 배열 Array의 현재 상태를 저장해준다
			for(int j=0; j<Array.length; j++) {
				tmp[j] = Array[j];
			}
			
			for(int j=0; j<=end-start; j++) {
				Array[start+j] = tmp[end-j];
			}
		}
		
		// check
		for(int i=1; i<Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
	}
	/*
	 * 원본배열 Array에서 직접 바꾸기 할건데
	 * 바꾸기 전에 배열 tmp에 저장해준다
	 */
}
