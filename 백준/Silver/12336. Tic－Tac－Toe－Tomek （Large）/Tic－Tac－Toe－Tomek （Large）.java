import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(sc.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            char[][] array = new char[4][4];
            for (int i = 0; i < 4; i++) {
                String str = sc.readLine();
                for (int j = 0; j < 4; j++) {
                    array[i][j] = str.charAt(j);
                }
            }
            if (test_case != T) sc.readLine();  // Skip the empty line between test cases

            sb.append("Case #").append(test_case).append(": ");
            sb.append(Match(array)).append("\n");
        }
        System.out.print(sb);
    }

    public static String Match(char[][] array) {
        boolean hasEmpty = false;

        // Check rows and columns
        for (int i = 0; i < 4; i++) {
            String row = "";
            String col = "";
            for (int j = 0; j < 4; j++) {
                row += array[i][j];
                col += array[j][i];
                if (array[i][j] == '.') hasEmpty = true;
            }
            String rowResult = checkLine(row);
            String colResult = checkLine(col);
            if (!rowResult.equals("")) return rowResult;
            if (!colResult.equals("")) return colResult;
        }

        // Check diagonals
        String diag1 = "";
        String diag2 = "";
        for (int i = 0; i < 4; i++) {
            diag1 += array[i][i];
            diag2 += array[i][3 - i];
        }
        String diag1Result = checkLine(diag1);
        String diag2Result = checkLine(diag2);
        if (!diag1Result.equals("")) return diag1Result;
        if (!diag2Result.equals("")) return diag2Result;

        if (hasEmpty) return "Game has not completed";
        return "Draw";
    }

    public static String checkLine(String line) {
        if (line.equals("XXXX") || line.equals("XXXT") || line.equals("XXTX") || line.equals("XTXX") || line.equals("TXXX"))
            return "X won";
        if (line.equals("OOOO") || line.equals("OOOT") || line.equals("OOTO") || line.equals("OTOO") || line.equals("TOOO"))
            return "O won";
        return "";
    }
}