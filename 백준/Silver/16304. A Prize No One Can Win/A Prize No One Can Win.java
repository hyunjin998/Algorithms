import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int n = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(sc.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] + array[i-1] <= X) cnt++;
            else break;
        } System.out.println(cnt);
    }
}