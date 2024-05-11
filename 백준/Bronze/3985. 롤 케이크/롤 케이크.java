
// 3985 롤 케이크

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int L = Integer.parseInt(sc.readLine());
		int N = Integer.parseInt(sc.readLine());
		int[] array = new int[L + 1]; // 배열 array의 크기는 롤 케이크 길이
		int[] cnt = new int[N + 1]; // 배열 cnt의 크기는 방청객 수 +1, 인덱스랑 값을 맞춰주기 위해
		int[] max = new int[N + 1];
		
		// 배열 값 0으로 초기화
		Arrays.fill(array, 0);
		Arrays.fill(cnt, 0);
		Arrays.fill(max, 0);

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(sc.readLine());
			int P = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			max[i] = K-P;
			
			// 롤 케이크 배분하기
			for (int j = P; j <= K; j++) {
				if (array[j] == 0) { // 아직 아무도 찜하지 않았으면
					array[j] = i; // 해당 인덱스의 값으로 방청객의 번호 넣기
					cnt[i]++; // 방청객++
				} else continue; // 찜했으면 컨티뉴
			}

		}

		int pig = 0;
		int cntMax = 0;
		int pigIdx = 0;
		int cntIdx = 0;
		// 조건을 만족하는 방청객이 두 명 이상이라면
		// 그 중 번호가 가장 작은 방청객의 번호를 출력해야하니까
		// 뒤에서부터 접근
		for (int k = cnt.length - 1; k > 0; k--) {
			// 진짜로 많이 먹은 사람
			if (pig <= max[k]) {
				pig = max[k];
				pigIdx = k;
			}
			
			// 많이 먹을 것 같은 사람
			if (cntMax <= cnt[k]) {
				cntMax = cnt[k];
				cntIdx = k;
			}
		}
		System.out.println(pigIdx + "\n" + cntIdx);

	}

}
