import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N;

    static ArrayList<Integer> []list;
    static boolean[] visited;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(sc.readLine());
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        answer = new int[N+1];


        for(int i=1; i<N+1; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(sc.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());

            list[parent].add(child);
            list[child].add(parent);
        }

        DFS(1);

        for(int i=2; i<N+1; i++){
            sb.append(answer[i]).append('\n');
        } System.out.println(sb);
    }

    private static void DFS(int idx) {
        visited[idx] = true;
        for(int i : list[idx]){
            if(!visited[i]){
                answer[i] = idx;
                DFS(i);
            }
        }
    }
}