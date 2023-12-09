import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		while(N>=0) {  // N이 0보다 같거나 클때까지
			sb.append(N).append(" ");  // sb에 추가하고
			N--;  // N은 1씩 깎아준다
		}
		
		System.out.println(sb);

	}

}