import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
        
		while(N>=0) sb.append(N--).append(" ");
		System.out.println(sb);
	}
}