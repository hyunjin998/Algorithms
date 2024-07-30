import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        int cnt = 0;
        int burger = 0;
        int coke = 10000;

        while (t >= max * cnt) {
            int tempT = t - max * cnt;
            int tempBurger = cnt;
            int tempCoke = 0;

            tempBurger += tempT / min;
            tempCoke += tempT % min;

            if (coke > tempCoke) {
                burger = tempBurger;
                coke = tempCoke;
            } else if (coke == tempCoke && burger < tempBurger) {
                burger = tempBurger;
                coke = tempCoke;
            } cnt++;
        } System.out.println(burger + " " + coke);
    }
}