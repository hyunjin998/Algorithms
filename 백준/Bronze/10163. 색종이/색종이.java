import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int[][] array = new int[1001][1001];

        int N = Integer.parseInt(st.nextToken());
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(sc.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = startX + Integer.parseInt(st.nextToken()) - 1;
            int endY = startY + Integer.parseInt(st.nextToken()) - 1;

            for(int x=startX; x<=endX; x++){
                for(int y=startY; y<= endY; y++){
                    array[x][y] = i;
                }
            }
        }

        int[] cntArray = new int[N+1];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                cntArray[array[i][j]] += 1;
            }
        }

        // check
//        for(int i=0; i<20; i++){
//            for(int j=0; j<20; j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int i=1; i<=N; i++){
            sb.append(cntArray[i]).append("\n");
        }

        System.out.println(sb);
    }
}