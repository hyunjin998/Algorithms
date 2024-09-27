import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(sc.readLine());
        int date = Integer.parseInt(sc.readLine());

        String answer = (month == 2 && date == 18 ? "Special" : month == 2 && date < 18 || month == 1 ? "Before" : "After");
        System.out.println(answer);
    }
}