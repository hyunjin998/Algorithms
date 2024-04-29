

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
// 1759 암호 만들기

	static int L;  // 4, 서로 다른 L개의 알파벳, 배열의 크기
	static int C;  // 6, C개의 문자들을 입력 받는다, 반복문의 횟수
	static String[] Array;
	static String[] vowel = {"a", "e", "i", "o", "u"};  // 모음 배열
	static String[] sel;  // 선택배열
	static int idx = 0;  // 원본배열 인덱스
	static int k = 0;  // 선택배열 인덱스
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		Array = new String[C];
		sel = new String[L];
		st = new StringTokenizer(sc.readLine());
		for(int i=0; i<C; i++) {
			Array[i] = st.nextToken();
		}
		
		Arrays.sort(Array);  // 정렬하면 아스키코드순으로 정렬됨
		CCL(idx, k);  // 조합한다, C C L
		
	}

	
	// 조합
	private static void CCL(int idx, int k) {
		// basis part
		if(k==sel.length) {
			// 문제의 조건에 맞지 않는 경우를 찾아서 빼준다.
			// 1. 모음이 아예 없는 경우
			// 2. 자음이 1개 이하인 경우(자음 = 0, 1)
			int cnt = 0;  // 모음의 갯수
			for(int x = 0; x<sel.length; x++) {  // 모음배열의 크기만큼 돈다
				for (int y=0; y<vowel.length; y++) {  // 선택배열의 크기만큼 돈다
					if(sel[x].equals(vowel[y])) {  // 선택배열이 모음배열과 같을 경우
						cnt++;  // 모음의 갯수++
					}
				}
			}
			
			// sel.length-cnt는 자음을 뜻한다.
			// 자음이 최소 2개 이상이고 모음(cnt)이 최소 1개 이상일 때
			if(sel.length-cnt >= 2 && cnt >= 1) {
				for(int j=0;j<sel.length; j++) {
					System.out.print(sel[j]);
				}
				System.out.println();
			}
			return;
		}
		
		// inductive part
		for(int i=idx; i<Array.length; i++) {
			sel[k] = Array[i];
			CCL(i+1, k+1);
		}
	}

	
	/*
	 * 문제
	 * 암호는 서로 다른 L개의 알파벳 소문자들로 구성되며
	 * 최소 한 개의 모음(a,e,i,o,u)와 최소 두 개의 자음으로 구성되어 있음
	 * 암호를 이루는 알파벳이 암호에서 증가하는 순서로 배열
	 * abc는 ㄱㄴ하지만 bac는 불가능
	 * 
	 * 암호로 사용했을 법한 문자의 종류는 C가지
	 * C개의 문자들이 모두 주어졌을 때
	 * 가능성 있는 암호들을 구하자
	 * 
	 * 
	 * 
	 * 어떻게 풀지 생각
	 * 1.
	 * C 크기의 일차원 배열을 선언해서 입력 받고 정렬
	 * CCL 조합 돌리는데 조건에 맞지 않은것을 뺀다.
	 * (1. 모음이 아예 없거나
	 * 2. 자음이 1개이하 (0, 1)
	 * 
	 * 
	 */
}
