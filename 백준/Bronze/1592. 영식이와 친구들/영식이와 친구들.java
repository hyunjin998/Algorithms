import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] visited = new int[N+1];
        Arrays.fill(visited, 0);
        int num = 1;
        int cnt = -1;

        while(visited[num] != M){
            num += L;
            cnt++;
            if(num > N) num -= N;
            visited[num]++;
        } System.out.println(cnt);
    }
}