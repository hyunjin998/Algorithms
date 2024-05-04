
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String str = sc.readLine();
		int[] array = new int[26];
		Arrays.fill(array, 0);

		for (int i = 0; i < str.length(); i++) {
			// 대문자로 출력해야되니까 입력받은 값을 모두 대문자로 바꿔준다. 
			char ch = Character.toUpperCase(str.charAt(i));
			// -65를 해서 해당 인덱스에 +1을 해준다. 
			array[ch - 65] += 1;
		}

		// check
		// System.out.println(Arrays.toString(array));

		// 많이 사용된 알파벳 인덱스 찾기
		int idx = 0;
		int max = array[0];
		String ans = "";
		
		for(int i=1; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				idx = i;
				ans = "";
			}
			
			else if (max == array[i]) {
				ans = "?";
			}
			
			else {
				continue;
			}
		}
		
		if(ans != "?") {
			ans = Character.toString(idx + 65);
		}
		System.out.println(ans);
	}

}