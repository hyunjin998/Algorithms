import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    static class TIME {
        String s1;
        String s2;
        double l;
    }

    static TIME[] tmp = new TIME[1001];
    static int[] mon_list = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n;
        double p;
        n = Integer.parseInt(sc.readLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i <= n; i++) {
            tmp[i] = new TIME();
            String[] input = sc.readLine().split(" ");
            tmp[i].s1 = input[0];
            tmp[i].s2 = input[1];
            tmp[i].l = Double.parseDouble(input[2]);
        }

        double tn = Convert(tmp[n].s1, tmp[n].s2);
        double up = 0, down = 0;

        for (int i = 1; i <= n; i++) {
            double ti = Convert(tmp[i].s1, tmp[i].s2);
            p = Math.max(Math.pow(0.5, (tn - ti) / 365), Math.pow(0.9, n - i));
            up += p * tmp[i].l;
            down += p;
        }

        double X = Math.round(up / down);
        System.out.println((int) X);
    }

    static double Convert(String s1, String s2) {
        double year = (s1.charAt(2) - '0') * 10 + (s1.charAt(3) - '0');
        double month = (s1.charAt(5) - '0') * 10 + (s1.charAt(6) - '0');
        double day = (s1.charAt(8) - '0') * 10 + (s1.charAt(9) - '0');
        day += year * 365;
        if (year > 20) day++;
        for (int i = 1; i <= month - 1; i++) {
            if (i == 2 && year == 20) day++;
            day += mon_list[i];
        }
        double hour = (s2.charAt(0) - '0') * 10 + (s2.charAt(1) - '0');
        double min = (s2.charAt(3) - '0') * 10 + (s2.charAt(4) - '0');
        double second = (s2.charAt(6) - '0') * 10 + (s2.charAt(7) - '0');
        double total = hour / 24 + min / (60 * 24) + second / (3600 * 24);
        day += total;
        return day;
    }
}