import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
		String str = sc.readLine();
		for(char ch : str.toCharArray()) {
			sb.append(ch).append('\n');
		} System.out.println(sb);
	}
}