import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] array = new int[N];
        st = new StringTokenizer(sc.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        int M = Integer.parseInt(sc.readLine());
        st = new StringTokenizer(sc.readLine());
        int answer = 0;

        for(int i=0; i<M; i++){
            int left = 0;
            int right = array.length - 1;
            int middle = 0;
            int num = Integer.parseInt(st.nextToken());

            while(left <= right){
                answer = 0;
                middle = (left+right)/2;

                if(num == array[middle]) {
                    answer = 1;
                    break;
                }

                if(num < array[middle]) right = middle-1;
                else left = middle+1;

            } sb.append(answer).append("\n");
        } System.out.println(sb);
    }
}