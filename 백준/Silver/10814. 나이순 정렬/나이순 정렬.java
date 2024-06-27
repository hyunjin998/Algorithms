import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        String[][] array = new String[N][2];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(sc.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }

        // check
//        System.out.println(Arrays.deepToString(array));

        Arrays.sort(array, (o1, o2) -> Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]));
        for(String[] str : array){
            sb.append(str[0]).append(" ").append(str[1]).append("\n");
        } System.out.println(sb);
    }
}