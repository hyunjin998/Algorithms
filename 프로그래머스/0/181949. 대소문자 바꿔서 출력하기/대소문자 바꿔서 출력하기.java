import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' & ch <= 'Z') {
				ch += 32;
			}
			else ch -= 32;
			sb.append(ch);
		}

		System.out.println(sb);
	}

}
