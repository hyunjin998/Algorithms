import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int[] array = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(sc.readLine());
            sum += array[i];
        }

        Arrays.sort(array);
        int except = Math.round((float) (n * 15) /100);

        for(int i=0; i<except; i++){
            sum -= array[i];
            sum -= array[n-1-i];
        }

        int answer = Math.round((float)sum/(n-except*2));
        System.out.println(answer);
    }
}