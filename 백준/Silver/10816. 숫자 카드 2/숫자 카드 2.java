import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] plus = new int[10000001];
        int[] minus = new int[10000001];

        int N = Integer.parseInt(sc.readLine());
        int[] card = new int[N];
        st = new StringTokenizer(sc.readLine());

        for(int i=0; i<N; i++){
            card[i] = Integer.parseInt(st.nextToken());

            if(card[i] >= 0) plus[card[i]] += 1;
            else minus[card[i] * -1] += 1;
        }

        int M = Integer.parseInt(sc.readLine());
        int[] howManyCard = new int[M];
        st = new StringTokenizer(sc.readLine());

        for(int i=0; i<M; i++){
            howManyCard[i] = Integer.parseInt(st.nextToken());
            int findNum = howManyCard[i];

            if(findNum >= 0) sb.append(plus[findNum]).append(" ");
            else sb.append(minus[findNum * -1]).append(" ");
        } System.out.println(sb);
    }
}