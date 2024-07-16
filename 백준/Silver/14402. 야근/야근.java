import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<String, Integer> inCount = new HashMap<>();
        HashMap<String, Integer> outCount = new HashMap<>();

        int q = Integer.parseInt(sc.readLine());
        int answer = 0;

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(sc.readLine());
            String s = st.nextToken();
            String p = st.nextToken();

            if(p.equals("-")) {
                if (inCount.getOrDefault(s, 0) == 0) answer++;
                else inCount.put(s, inCount.get(s) - 1);
                outCount.put(s, outCount.getOrDefault(s, 0) + 1);
            } else inCount.put(s, inCount.getOrDefault(s, 0) + 1);
        }

        for (String name : inCount.keySet()) {
            int remaining = inCount.get(name);
            if (remaining > 0) {
                answer += remaining;
            }
        } System.out.println(answer);
    }
}