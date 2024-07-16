import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int N;
    static int[][] array;

    static int num = 1;
    static int dist = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(sc.readLine());
        array = new int[N][N];

        FillNum(0, 0);
        PrintArray(array);
        System.out.println(sb);
    }

    public static void FillNum(int x, int y) {
        while (num <= N * N) {
            array[x][y] = num++;
            int currX = x + dx[dist];
            int currY = y + dy[dist];

            if (currX < 0 || currX >= N || currY < 0 || currY >= N || array[currX][currY] != 0) {
                dist = (dist + 1) % 4;
                currX = x + dx[dist];
                currY = y + dy[dist];
            }
            x = currX;
            y = currY;
        }
    }

    public static void PrintArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                sb.append(num).append(' ');
            } sb.append('\n');
        }
    }
}