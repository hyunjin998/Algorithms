import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        // 입력값 읽기
        int N = Integer.parseInt(sc.readLine());
        String beads = sc.readLine();

        // 결과를 저장할 변수
        int maxLength = 0;

        // 두 포인터를 사용하여 윈도우 탐색
        int left = 0;
        int right = 0;

        while (right < N) {
            // 윈도우 내의 문자열이 모든 종류의 사람들에게 아름다운지 확인
            if (isBeautiful(beads, left, right)) {
                // 아름답다면 길이를 갱신
                maxLength = Math.max(maxLength, right - left + 1);
                // 오른쪽 포인터를 증가시켜 더 긴 부분 문자열을 확인
                right++;
            } else {
                // 아름답지 않다면 왼쪽 포인터를 증가시켜 윈도우를 좁힘
                left++;
            }
        }
        System.out.println(maxLength);
    }

    // 문자열의 특정 부분이 모든 사람들에게 아름다운지 확인하는 함수
    private static boolean isBeautiful(String beads, int left, int right) {
        char previous = ' ';
        for (int i = left; i <= right; i++) {
            char current = beads.charAt(i);

            // 일반 시력
            if (previous == current) return false;

            // 빨간색 색맹 (Protanopia)
            if ((previous == 'R' && current == 'V') || (previous == 'V' && current == 'R')) return false;

            // 파란색 색맹 (Tritanopia)
            if ((previous == 'B' && current == 'V') || (previous == 'V' && current == 'B')) return false;

            previous = current;
        }
        return true;
    }
}