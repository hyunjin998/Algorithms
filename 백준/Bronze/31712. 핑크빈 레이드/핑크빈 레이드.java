import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] array = new int[3][2];
        int attack = 0;

        for(int i=0; i<3; i++){
            st = new StringTokenizer(sc.readLine());
            for(int j=0; j<2; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            } attack += array[i][1];
        }

        int H = Integer.parseInt(sc.readLine()) - attack;
        Arrays.sort(array, (o1, o2) -> o1[0] - o2[0]);

        int time = 0;

        while(H > 0) {
            time++;
            for(int i=0; i<3; i++){
                if(time % array[i][0] == 0 ){
                    H -= array[i][1];
                }
            }
        } System.out.println(time);
    }
}