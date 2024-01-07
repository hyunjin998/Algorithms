import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = " is ";
        String ans = "";
        
        if(n%2==0) ans = "even";
        else ans = "odd";
        
        System.out.println(n + str + ans);
    }
}