import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String answer = "";
        int cnt = 0;

        if(N==1){
            System.out.println("666");
            return;
        }

        for(int i=0; cnt<N; i++){
            answer = Integer.toString(i);
            if(answer.contains("666")) cnt++;
        } System.out.println(answer);
    }
}