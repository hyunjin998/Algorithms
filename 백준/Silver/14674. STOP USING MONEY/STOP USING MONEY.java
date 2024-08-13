import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static class Game {
        int index;
        int price;
        int satisfaction;

        public Game(int index, int price, int satisfaction) {
            this.index = index;
            this.price = price;
            this.satisfaction = satisfaction;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Game[] games = new Game[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(sc.readLine());
            int index = Integer.parseInt(st.nextToken());  // 게임 번호
            int price = Integer.parseInt(st.nextToken());  // 게임 가격
            int satisfaction = Integer.parseInt(st.nextToken());  // 게임 만족도

            games[i] = new Game(index, price, satisfaction);
        }

        Arrays.sort(games, (a, b) -> {
            long valueComparison = (long) b.satisfaction * a.price - (long) a.satisfaction * b.price;
            if (valueComparison != 0) return Long.compare(valueComparison, 0);
            else if (a.price != b.price) return Integer.compare(a.price, b.price);
            else return Integer.compare(a.index, b.index);
        });

        for (int i = 0; i < K; i++) {
            sb.append(games[i].index).append('\n');
        } System.out.print(sb);
    }
}