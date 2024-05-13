

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
// 15649 N과 M(1)
	static int N;  // 숫자 
	static int M;  // 선택배열의 크기 
	static int[] arr;  // 원본배열 
	static int[] sel;  // 선택배열 
	static boolean[] visited;  // 방문배열 
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		sel = new int[M];  // 배열 sel의 크기를 M으로 해준다 
		visited = new boolean[N];
		
		// 원본배열에 값 넣기 
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		recursive(0);
		

	}
	/*
	 * 순열 
	 * 원본배열, 선택배열, 원본배열인덱스, 선택배열인덱스 
	 */


	private static void recursive(int k) {  // 원본배열 인덱스, 선택배열 인덱스
		// basis part
		if(k == sel.length) {
			for(int j=0; j<sel.length; j++) {
				System.out.println(sel[j]);
			}
			return;
		}
		
		// inductive part
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				sel[k] = arr[i];
				recursive(k+1);
				visited[i] = false;
			}
		}
		
		
	}


	
}
