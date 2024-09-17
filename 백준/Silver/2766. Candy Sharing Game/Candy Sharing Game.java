import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = Integer.parseInt(sc.readLine());
            if (N == 0) break;

            int[] candies = new int[N];
            for (int i = 0; i < N; i++) {
                candies[i] = Integer.parseInt(sc.readLine());
            }

            int rounds = 0;
            while (!allEqual(candies)) {
                int[] newCandies = new int[N];
                for (int i = 0; i < N; i++) {
                    int right = (i + 1) % N;
                    newCandies[right] += candies[i] / 2;
                    newCandies[i] += candies[i] / 2;
                }

                for (int i = 0; i < N; i++) {
                    if (newCandies[i] % 2 != 0) {
                        newCandies[i]++;
                    }
                }

                candies = newCandies;
                rounds++;
            } sb.append(rounds).append(' ').append(candies[0]).append('\n');
        } System.out.print(sb);
    }

    static boolean allEqual(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) return false;
        } return true;
    }
}