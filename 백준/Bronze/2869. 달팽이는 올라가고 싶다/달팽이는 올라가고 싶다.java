import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int answer = (V-A) / (A-B) + 1;
        if((V-A) % (A-B) != 0) answer += 1;

//        if(A==V) {
//            answer = 1;
//            return;
//        }
//        if((V-A) >= (A-B)) {
//            if((V-A) % (A-B) == 0) answer = (V-A) / (A-B) + 1;
//            else answer = (V-A) / (A-B) + 2;
//        }  else answer = 2;

        System.out.println(answer);
    }
}