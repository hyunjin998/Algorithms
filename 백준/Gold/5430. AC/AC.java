import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

// 5430 AC 
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(sc.readLine());
        for(int test_case = 0; test_case < T; test_case++) {
            String p = sc.readLine();
            int n = Integer.parseInt(sc.readLine());
            String array = sc.readLine();
            Deque<Integer> deque = new LinkedList<>();
            for (String str : array.substring(1, array.length() - 1).split(",")) {
                if (!str.equals("")) {
                    deque.add(Integer.valueOf(str));
                }
            }
            AC(deque, p);
        }
    }
    public static void AC(Deque<Integer> deque, String p) {
        boolean reverse = false;
        for(int i = 0 ; i < p.length(); i++) {
            if(p.charAt(i) == 'R') {
                reverse = !reverse;
            } else {
                if(deque.size() == 0) {
                    System.out.println("error");
                    return;
                }
                if(reverse) {
                    deque.removeLast();
                } else {
                    deque.removeFirst();
                }
            }
        }
        StringBuilder sb = new StringBuilder("[");
        while(!deque.isEmpty()) {
            sb.append(reverse ? deque.removeLast() : deque.removeFirst());
            if(deque.size() != 0) {
                sb.append(",");
            }
        }
        sb.append(']');
        System.out.println(sb);
    }
}