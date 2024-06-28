import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int answer = 0;
        for(int i=1; i<=N; i++){
            String total = i + "";
            answer = Integer.parseInt(total);

            for(int j=0; j<total.length(); j++){
                answer += total.charAt(j) - '0';
            }

            if(answer == N) {
                answer = Integer.parseInt(total);
                break;
            } else answer = 0;
        } System.out.println(answer);
    }
}