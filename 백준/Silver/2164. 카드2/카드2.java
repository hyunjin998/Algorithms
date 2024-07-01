import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        // check
//        System.out.println(queue);

        while(queue.size() != 1){
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.peek());
    }
}