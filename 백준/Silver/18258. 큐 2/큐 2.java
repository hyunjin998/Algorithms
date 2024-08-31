import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(sc.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(sc.readLine());
            String opt = st.nextToken();

            switch(opt){
                case "push" : {
                    int num = Integer.parseInt(st.nextToken());
                    queue.offerLast(num);
                    break;
                }

                case "pop":{
                    if(!queue.isEmpty()) sb.append(queue.pop()).append('\n');
                    else sb.append(-1).append('\n');
                    break;
                }

                case "size":{
                    sb.append(queue.size()).append('\n');
                    break;
                }

                case "empty":{
                    if(queue.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                }

                case "front":{
                    if(!queue.isEmpty()) sb.append(queue.peekFirst()).append('\n');
                    else sb.append(-1).append('\n');
                    break;
                }

                case "back":{
                    if(!queue.isEmpty()) sb.append(queue.peekLast()).append('\n');
                    else sb.append(-1).append('\n');
                    break;
                }
            }
        } System.out.println(sb);
    }
}