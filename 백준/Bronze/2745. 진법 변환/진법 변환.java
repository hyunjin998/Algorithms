import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int len = N.length();
        int sum = 0;

        for(int i=0; i<len; i++){
            int num = N.charAt(i) - '0';

//            if(ch >= '0' && ch <= '9') num = ch - '0';
//            else num = ch - 'A' + 10;
            if(num >= 10) num -= 7;

            sum += (int) (num * Math.pow(B, len - i - 1));
        }
        System.out.println(sum);
    }
}