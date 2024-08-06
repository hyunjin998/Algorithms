import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] array;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        array = new int[5][5];
        visited = new boolean[5][5];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(sc.readLine());
            for (int j = 0; j < 5; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(sc.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        System.out.println(DFS(x, y, 0, 0));
    }

    public static int DFS(int x, int y, int depth, int cnt) {
        visited[x][y] = true;

        if (array[x][y] == 1) cnt++;

        if (cnt >= 2) {
            visited[x][y] = false;
            return 1;
        }

        if (depth == 3) {
            visited[x][y] = false;
            return 0;
        }

        for (int i = 0; i < 4; i++) {
            int currX = x + dx[i];
            int currY = y + dy[i];

            if (currX >= 0 && currX < 5 && currY >= 0 && currY < 5 && array[currX][currY] != -1 && !visited[currX][currY]) {
                if (DFS(currX, currY, depth + 1, cnt) == 1) {
                    visited[x][y] = false;
                    return 1;
                }
            }
        }
        visited[x][y] = false;
        return 0;
    }
}