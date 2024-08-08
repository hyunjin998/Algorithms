import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        String[] univ = {"Soongsil", "Korea", "Hanyang"};
        int[] array = new int[3];

        int sum = 0;
        String univName = "";
        int min = Integer.MAX_VALUE;

        for(int i=0; i<3; i++){
            int num = Integer.parseInt(st.nextToken());
            array[i] = num;
            sum += num;

            if(min > num) {
                min = num;
                univName = univ[i];
            }
        }

        System.out.println(sum < 100 ? univName : "OK");
    }
}