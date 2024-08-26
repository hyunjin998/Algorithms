import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
        String answer = (n%2 == 0 ? " is even" : " is odd");
        System.out.println(n + answer);
    }
}