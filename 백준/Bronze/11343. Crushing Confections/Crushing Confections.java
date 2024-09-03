import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());

        while (t-- > 0) {
            sc.readLine();
            StringTokenizer st = new StringTokenizer(sc.readLine());
            int rows = Integer.parseInt(st.nextToken());
            int cols = Integer.parseInt(st.nextToken());
            char[][] grid = new char[rows][cols];

            for (int i = 0; i < rows; i++) {
                String line = sc.readLine().replace(" ", "");
                for (int j = 0; j < cols; j++) {
                    grid[i][j] = line.charAt(j);
                }
            }

            boolean found = false;

            // 가로로 세 개의 동일한 색상 캔디 찾기
            for (int i = 0; i < rows && !found; i++) {
                for (int j = 0; j < cols - 2 && !found; j++) {
                    if (grid[i][j] == grid[i][j+1] && grid[i][j+1] == grid[i][j+2]) {
                        System.out.printf("%d %d %d %d %d %d\n", i+1, j+1, i+1, j+2, i+1, j+3);
                        found = true;
                    }
                }
            }

            // 세로로 세 개의 동일한 색상 캔디 찾기
            for (int j = 0; j < cols && !found; j++) {
                for (int i = 0; i < rows - 2 && !found; i++) {
                    if (grid[i][j] == grid[i+1][j] && grid[i+1][j] == grid[i+2][j]) {
                        System.out.printf("%d %d %d %d %d %d\n", i+1, j+1, i+2, j+1, i+3, j+1);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("no set found");
            }
        }
    }
}