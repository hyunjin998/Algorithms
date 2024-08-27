import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // 종료 조건
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 초기 값 설정
            int prev2 = a;
            int prev1 = b;
            int current = 0;

            // c년 후의 인구 계산
            for (int i = 0; i < c; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }

            // 결과 출력
            System.out.println(current);
        }

        scanner.close();
    }
}