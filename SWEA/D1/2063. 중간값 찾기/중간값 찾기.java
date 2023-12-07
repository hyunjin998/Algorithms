import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(sc.readLine());
		st = new StringTokenizer(sc.readLine());
		
		// 인덱스를 사용해 값에 접근할 것이기 때문에
		// 배열 대신 ArrayList 사용
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			// 리스트에 num값 추가
			list.add(num);
		}
		
		// 리스트를 정렬한다
		Collections.sort(list);
		// 리스트의 중간값 출력
		System.out.println(list.get(N/2));
	}

}