import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(sc.readLine());
        double[] array = new double[N];

        for(int i=0; i<N; i++){
            array[i] = Double.parseDouble(sc.readLine());
        }
        Arrays.sort(array);
        System.out.printf("%.2f", array[1]);
    }
}