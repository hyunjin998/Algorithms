import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());
        for(int test_case=1; test_case<=T; test_case++){
            st = new StringTokenizer(sc.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(sc.readLine());
            int[] array = new int[N];
            int answer = 0;

            for(int i=0; i<N; i++){
                array[i] = Integer.parseInt(st.nextToken());
            }

            int left = 0;
            int right = N-1;

            for(int i=0; left<right; i++){
                int sum = array[left] + array[right];
                if(sum == M) {
                    answer++;
                    left++;
                }
                else if (sum < M) left++;
                else right--;
            } sb.append("Case").append(' ').append("#").append(test_case).append(": ").append(answer).append('\n');
        } System.out.println(sb);
    }
}