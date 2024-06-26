import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		for(Character c : a.toCharArray()) {
            if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        System.out.println(sb);
	}
}
