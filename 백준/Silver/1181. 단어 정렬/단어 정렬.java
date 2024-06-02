import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 1181 단어 정렬 
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(sc.readLine());
		String[] array = new String[N];
		
		for(int i=0; i<N; i++) {
			array[i] = sc.readLine();
		}
		
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
			
		});
	
		sb.append(array[0]).append('\n');
		for(int i=1; i<N; i++) {
			if(!array[i].equals(array[i-1])) {
				sb.append(array[i]).append('\n');
			}
		}
		System.out.println(sb);
	}

}
