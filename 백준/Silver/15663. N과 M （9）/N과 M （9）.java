
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

// 15663 N과 M(9) 
public class Main {

	// static StringBuilder sb;
	static LinkedHashSet<String> lhs;  // 출력값 
	
	static int N;  // 자연수의 수, 반복문의 횟수, 배열의 크기 
	static int M;  // 선택배열의 크기 
	
	static int[] array;
	static int[] sel;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		// sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
	
		array = new int[N];
		sel = new int[M];
		visited = new boolean[N];
		lhs = new LinkedHashSet<>();
		
		// array에 입력값 넣기 
		st = new StringTokenizer(sc.readLine());
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		// check
		// System.out.println(Arrays.toString(array));
		
		recursive(0);
		lhs.forEach(System.out::println);

	}

	private static void recursive(int k) {
		// basis part
		if(k==sel.length) {
			StringBuilder sb = new StringBuilder();
			for(int j : sel) {
				sb.append(j).append(" ");
			}
			/*
			for(int j=0; j<sel.length; j++) {
				sb.append(sel[j]).append(" ");
			}*/
			lhs.add(sb.toString());
			return;
		}
		
		
		// inductive part
		for(int i=0; i<array.length; i++) {
			if(visited[i]) continue;  // 이미 방문했으면 반복문 돈다 
			visited[i] = true;  // 방문하지 않았으면 방문처리 해주고 
			sel[k] = array[i];  // 선택배열에 값을 넣는다 
			recursive(k+1);
			visited[i] = false;  // 재귀 돌아오면 방문배열을 false로 다시 초기화
		}
		
	}

	/*
	 * 중복 없는 조합 
	 */
}
