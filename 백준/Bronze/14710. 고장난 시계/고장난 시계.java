import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        String answer = "X";

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if(hour%30 == 0 && min == 0) answer = "O";    // 정각
        if((hour-(min/12))%30 == 0 && min%12 == 0) answer = "O";
        System.out.println(answer);
    }
}