import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> s = new ArrayDeque<>();
        Stack<Boolean> front = new Stack<>();

        int n = Integer.parseInt(sc.readLine());
        for (int i = 0; i < n; i++) {
            String tmp = sc.readLine();
            if (tmp.charAt(0) == '3') {
                if (!s.isEmpty()) {
                    if (front.pop()) s.pollFirst();
                    else s.pollLast();
                }
            } else if (tmp.charAt(0) == '1') {
                s.offerLast(tmp.charAt(2));
                front.push(false);
            } else {
                s.offerFirst(tmp.charAt(2));
                front.push(true);
            }
        }

        if (!s.isEmpty()) {
            StringBuilder result = new StringBuilder();
            for (char c : s) {
                result.append(c);
            } System.out.println(result.toString());
        } else System.out.println(0);
    }
}