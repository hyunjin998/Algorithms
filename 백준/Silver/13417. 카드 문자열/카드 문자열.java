import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(sc.readLine());
        for(int test_case=0; test_case<T; test_case++){
            int N = Integer.parseInt(sc.readLine());
            String[] array = sc.readLine().split(" ");

            ArrayDeque<String> queue = new ArrayDeque<>();
            queue.add(array[0]);

            for(int i=1; i<N; i++){
                assert queue.peekFirst() != null;
                if(array[i].compareTo(queue.peekFirst()) <= 0) queue.addFirst(array[i]);
                else queue.addLast(array[i]);
            }

            for(String str : queue) {
                sb.append(str);
            } sb.append("\n");
        } System.out.println(sb);
    }
}