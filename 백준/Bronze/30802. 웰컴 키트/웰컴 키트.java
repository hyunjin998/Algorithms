import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(sc.readLine());

        int[] array = new int[6];
        st = new StringTokenizer(sc.readLine());

        for(int i=0; i<6; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(sc.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i=0; i<6; i++){
            if(array[i] % T != 0) cnt += 1;
            cnt += array[i]/T;
        }
        sb.append(cnt).append("\n").append(N/P).append(" ").append(N%P);
        System.out.println(sb);
    }
}