import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Integer> hash = new HashMap<>();
        hash.put('+', 1);
        hash.put('-', 1);
        hash.put('*', 2);
        hash.put('/', 2);

        String str = sc.readLine();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (hash.containsKey(ch)) {
                while (!stack.isEmpty() && stack.peek() != '(' && hash.get(ch) <= hash.get(stack.peek())) {
                    sb.append(stack.pop());
                } stack.push(ch);
            }

            else if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                } stack.pop(); // '(' 제거
            }

            else sb.append(ch);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        } System.out.println(sb);
    }
}