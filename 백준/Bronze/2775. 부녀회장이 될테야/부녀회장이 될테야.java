import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int[][] array = new int[15][15];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][0] = 1;
                array[0][i] = i+1;
            }
        }

        for(int i=1; i<array.length; i++){
            for(int j=1; j<array[i].length; j++){
                array[i][j] = array[i-1][j] + array[i][j-1];
            }
        }

        int T = Integer.parseInt(st.nextToken());
        for(int i=0; i<T; i++){
            st = new StringTokenizer(sc.readLine());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(sc.readLine());
            int n = Integer.parseInt(st.nextToken());

            System.out.println(array[k][n-1]);
        }
    }
}