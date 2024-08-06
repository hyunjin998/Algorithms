import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int M;
    static int[][] P;
    static int[][] Q;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(sc.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        P = new int[N][2];
        Q = new int[M][2];

        Input(P, N);
        Input(Q, M);

        Radius();
    }

    public static void Input(int[][] array, int num) throws IOException{
        for(int i=0; i<num; i++){
            st = new StringTokenizer(sc.readLine());
            for(int j=0; j<2; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public static void Radius(){
        long squareRadius = 0;
        long max = Integer.MIN_VALUE;

        for(int i=0; i<M; i++){
            int qx = Q[i][0];
            int qy = Q[i][1];

            for(int j=0; j<N; j++){
                int px = P[j][0];
                int py = P[j][1];

                squareRadius = (long)(qx-px) * (qx-px) + (long)(qy-py) * (qy-py);
                max = Math.max(max, squareRadius);
            }
        } System.out.println(max);
    }
}