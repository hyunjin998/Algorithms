import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());

        while (T-- > 0) {
            long n = Long.parseLong(sc.readLine());
            List<Integer> vec = new ArrayList<>();

            // 1. n을 이진수로 변환 (vec 리스트에 저장)
            while (n > 0) {
                vec.add((int) (n % 2));
                n = (long) (n / 2.0);
            }

            // 2. 이진수를 삼진수로 변환
            long l = 0;
            for (int i = 0; i < vec.size(); i++) {
                if (vec.get(i) == 1) {
                    long tp = 1;
                    // 3의 제곱 계산
                    for (int j = 0; j < i; j++) {
                        tp *= 3;
                    } l += tp;
                }
            } sb.append(l).append('\n');
        } System.out.print(sb);
    }
}