import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sc.readLine());
        int[] array = new int[10001];

        int max = 0;
        int ans = 0;

        for(int i=0; i<N; i++){
            int idx = Integer.parseInt(sc.readLine());
            array[idx] += 1;

            if(max < array[idx]){
                max = array[idx];
                ans = idx;
            }
        } System.out.println(array[ans]);
    }
}