

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;

	static int[] array;
	static int[] sel;
	static int sum = 0;
	static int max = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		N = Integer.parseInt(st.nextToken()); // 5
		M = Integer.parseInt(st.nextToken()); // 21

		array = new int[N];
		sel = new int[3];

		// array에 값 넣기
		st = new StringTokenizer(sc.readLine());
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken()); // 5 6 7 8 9
		}

		recursive(0, 0);
		System.out.println(max);
	}

	private static void recursive(int k, int idx) {
		// basis part
		if (k == sel.length) {
			for (int j = 0; j < sel.length; j++) {
				if (sum > M) break;
				sum += sel[j];
				// System.out.print(sel[j] + " ");
			}
			// System.out.println("sum" + sum);
			return;
		}

		// inductive part
		for (int i = idx; i < array.length; i++) {
			sel[k] = array[i];
			recursive(k + 1, i + 1);
			if(sum <= M) {
				max = Math.max(max, sum);				
			}
			sum = 0;
		}

	}

}