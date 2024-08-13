import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int todayYear = 2000 + Integer.parseInt(st.nextToken());
        int todayMonth = Integer.parseInt(st.nextToken());
        int todayDay = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(sc.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(sc.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            boolean validYMD = isValidDate(2000 + A, B, C);
            boolean validDMY = isValidDate(2000 + C, B, A);
            boolean validMDY = isValidDate(2000 + C, A, B);

            boolean isSafe = true;
            boolean isInvalid = !validYMD && !validDMY && !validMDY;

            if (validYMD && !isSafeDate(todayYear, todayMonth, todayDay, 2000 + A, B, C)) {
                isSafe = false;
            }
            if (validDMY && !isSafeDate(todayYear, todayMonth, todayDay, 2000 + C, B, A)) {
                isSafe = false;
            }
            if (validMDY && !isSafeDate(todayYear, todayMonth, todayDay, 2000 + C, A, B)) {
                isSafe = false;
            }

            if (isInvalid) {
                sb.append("invalid\n");
            } else if (isSafe) {
                sb.append("safe\n");
            } else {
                sb.append("unsafe\n");
            }
        }

        System.out.print(sb);
    }

    private static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) return false;
        if (day < 1) return false;

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return day <= 29;
        }

        return day <= daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    private static boolean isSafeDate(int todayYear, int todayMonth, int todayDay, int year, int month, int day) {
        if (year > todayYear) return true;
        if (year == todayYear) {
            if (month > todayMonth) return true;
            if (month == todayMonth) {
                return day >= todayDay;
            }
        }
        return false;
    }
}