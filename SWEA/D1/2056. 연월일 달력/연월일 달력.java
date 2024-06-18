import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.readLine();
            String year = str.substring(0, 4);
            int month = Integer.parseInt(str.substring(4, 6));
            int date = Integer.parseInt(str.substring(6, 8));

            String answer = "-1";
            if (!year.equals("0000") && 1 <= month && month <= 12 && 1 <= date && date <= 31) {
                answer = "1";
                if (month == 2 && date > 28) answer = "-1";
                if (month == 4 || month == 6 || month == 9 || month == 11 && date > 30) answer = "-1";
            }

            String months = "0";
            if(month < 10) months += month;
            else months = Integer.toString(month);

            String dates = "0";
            if(date < 10) dates += date;
            else dates = Integer.toString(date);

            if (answer.equals("1")) answer = year + "/" + months + "/" + dates;
            sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        } System.out.println(sb);
    }
}