import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(sc.readLine());
		for(int test_case=1; test_case<=T; test_case++) {
			int idx = Integer.parseInt(sc.readLine());
			
			// 점수는 0부터 100점까지 101가지이므로
			// 학생들의 점수를 담는 일차원 배열 array의 크기는 101 
			int[] array = new int[101];
			
			int max = 0;  // 점수, 최저 0점이므로 0으로 초기화
			int ans = 0;
			
			// 점수 불러오기
			st = new StringTokenizer(sc.readLine());
			
			// 학생의 수는 1,000명
			for(int i=0; i<1000; i++) {
				int score = Integer.parseInt(st.nextToken());
			
				// 점수에 해당하는 인덱스에 1씩 넣어주기
				array[score] += 1;
			}
			
			// check
			// System.out.println(Arrays.toString(array));
			
			// array를 돌면서 최대값 찾기
			for(int i=0; i<array.length; i++) {
				// 최빈수가 여러개일 경우 가장 큰 점수를 출력해야 하므로 부등호는 <=
				if(max <= array[i]) {
					max = array[i];
					ans = i;  // ans는 해당 값이 아니라 해당 인덱스 (인데스 == 점수)
				}
			}
			sb.append("#").append(idx).append(" ").append(ans).append("\n");
		}
		System.out.println(sb);

	}

}