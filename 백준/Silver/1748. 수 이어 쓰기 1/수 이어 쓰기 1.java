import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(sc.readLine());
        String numLength = num + " ";
        int len = numLength.length() - 1;

        String str = "9";
        int sum = 0;
        for(int i=1; i<len; i++){
            sum += Integer.parseInt(str);
            str += 9;
        } System.out.println(num*len - sum);
    }
}