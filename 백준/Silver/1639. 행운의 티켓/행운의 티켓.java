import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();
        int max = 0;

        for(int n=1; n <= len/2; n++) {
            for (int i=0; i <= len-2*n; i++) {
                int leftSum = 0;
                int rightSum = 0;

                for (int j=i; j < i+n; j++) {
                    leftSum += str.charAt(j) - '0';
                }

                for (int j = i+n; j < i+2*n; j++) {
                    rightSum += str.charAt(j) - '0';
                }

                if (leftSum == rightSum) max = Math.max(max, 2 * n);
            }
        } System.out.println(max);
    }
}