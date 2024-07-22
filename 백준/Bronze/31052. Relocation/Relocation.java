import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int[] array = new int[N+1];

        st = new StringTokenizer(sc.readLine());
        for(int i=1; i<=N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<Q; i++){
            st = new StringTokenizer(sc.readLine());
            int opt = Integer.parseInt(st.nextToken());

            switch(opt){
                case 1 : {
                    int idx = Integer.parseInt(st.nextToken());
                    int dis = Integer.parseInt(st.nextToken());
                    array[idx] = dis;
                    break;
                }

                case 2 : {
                    int A = Integer.parseInt(st.nextToken());
                    int B = Integer.parseInt(st.nextToken());
                    sb.append(Math.abs(array[A]-array[B])).append("\n");
                    break;
                }
            }
        } System.out.println(sb);
    }
}