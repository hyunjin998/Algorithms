import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(sc.readLine());

        sb.append(N).append(' ');
        for(int i=1; i<N-1; i++){
            sb.append(i).append(' ');
        }
        sb.append(N-1);
        System.out.println(sb);
    }
}