import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
        String answer = "";
		
		for(Character c : a.toCharArray()) {
            if(Character.isUpperCase(c)) answer += Character.toLowerCase(c);
            else answer += Character.toUpperCase(c);
        }
        System.out.println(answer);
	}
}
