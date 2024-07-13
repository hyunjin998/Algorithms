import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(sc.readLine());
        int[] array = new int[n];
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(sc.readLine());
        }

        int idx = 0;
        for(int i=1; i<=n; i++){
            stack.add(i);
            sb.append("+").append("\n");

            while(!stack.isEmpty() && stack.peek() == array[idx]){
                answer[idx] = stack.pop();
                idx++;
                sb.append("-").append("\n");
            }
        }

        for(int i=0; i<n; i++){
            if(array[i] != answer[i]) {
                System.out.println("NO");
                return;
            }
        }
//        sb.deleteCharAt(sb.lastIndexOf("\n"));
        System.out.println(sb);
    }
}