import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(sc.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(sc.readLine());
            int opt = Integer.parseInt(st.nextToken());

            switch(opt){
                case 1 : {
                    int num = Integer.parseInt(st.nextToken());
                    queue.addFirst(num);
                    break;
                }

                case 2 : {
                    int num = Integer.parseInt(st.nextToken());
                    queue.addLast(num);
                    break;
                }

                case 3 : {
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.pollFirst()).append('\n');
                    break;
                }

                case 4 : {
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.pollLast()).append('\n');
                    break;
                }

                case 5 : {
                    sb.append(queue.size()).append('\n');
                    break;
                }

                case 6 : {
                    if(queue.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                }

                case 7 : {
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.peekFirst()).append('\n');
                    break;
                }

                case 8 : {
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.peekLast()).append('\n');
                    break;
                }
            }
        } System.out.println(sb);
    }
}