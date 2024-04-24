import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
// 1717 집합의 표현
	static int[] Array;
	static String ans = "NO"; // 1. No가 아니라 NO임

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Array = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			Array[i] = i;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(sc.readLine());

			int opt = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			ans = "NO"; // 2. 반복문 돌때마다 NO로 초기화(한번 YES가 나오면 이후 답이 YES로 고정됨 )

			switch (opt) {
			case 0: {
				merge(a, b);
				break;
			}
			case 1: {
				isUnion(a, b);
				sb.append(ans).append("\n");
				break;
			}
			}
		}
		System.out.println(sb);
	}

	static void merge(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) return;

		/*
		 * else를 안해도 if 조건을 만족하지 못하면 아래 구문 실행됨 일관성을 위해 max와 min 활용
		 */
		Array[Math.max(x, y)] = Math.min(x, y);
	}

	static int find(int x) {
		if (Array[x] == x) return x;

      /*
       * find method는 잘했네!!
       * else를 안해도 if 조건을 만족하지 못하면 아래 구문 실행됨
       */
      return Array[x] = find(Array[x]);
      }

	static void isUnion(int x, int y) {
      /*

   * 4. x와 y가 들어오면 배열 요소로 조건을 주면 안됨
   * find를 사용해 부모를 확인해 줘야 맞는 값이 나옴
   * 
   * 원본 코드 반례
   * 7 8
   * 0 1 3
   * 1 1 7
   * 0 7 6
   * 1 7 1
   * 0 3 7
   * 0 4 2
   * 0 1 1
   * 1 1 1
   * 
   */
		if (find(x) == find(y))
			ans = "YES";
	}
}