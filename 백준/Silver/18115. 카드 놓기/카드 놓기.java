import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(sc.readLine());
        char[] cards = new StringBuilder(sc.readLine().trim()).reverse().toString().toCharArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int num = 1;

        for(char card : cards){
            switch(card){
                case '1' : {
                    queue.addFirst(num);
                    num++;
                    break;
                }
                case '2' : {
                    int tmp = queue.removeFirst();
                    queue.addFirst(num);
                    queue.addFirst(tmp);
                    num++;
                    break;
                }
                case '3' : {
                    queue.addLast(num);
                    num++;
                    break;
                }
            } // end switch
        } // end for

        for(int i=0; i<N; i++){
            sb.append(queue.pop()).append(' ');
        } System.out.println(sb);
    }
}