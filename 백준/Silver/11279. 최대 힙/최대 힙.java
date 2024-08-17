import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(sc.readLine());
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(sc.readLine());
            if(num == 0) {
                if (queue.isEmpty()) sb.append("0").append('\n');
                else sb.append(queue.poll()).append('\n');
            } else queue.add(num);
        } System.out.println(sb);
    }
}