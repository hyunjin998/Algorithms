import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());
        for(int test_case=1; test_case<=T; test_case++){
            HashMap<String, Integer> hash = new HashMap<>();

            st = new StringTokenizer(sc.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for(int i=0; i<n; i++){
                String key = sc.readLine();
                hash.put(key, 0);
            }

            for(int i=0; i<m; i++){
                st = new StringTokenizer(sc.readLine());
                String key = st.nextToken();
                int value = Integer.parseInt(st.nextToken());
                hash.put(key, hash.get(key) + value);
            }

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(hash.entrySet());
            entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            String winner = entries.get(0).getKey();
            int max = entries.get(0).getValue();

            sb.append("VOTE ").append(test_case).append(": ");
            if(max != entries.get(1).getValue()) sb.append("THE WINNER IS ").append(winner).append(' ').append(max).append('\n');
            else sb.append("THERE IS A DILEMMA").append('\n');
        } System.out.println(sb);
    }
}