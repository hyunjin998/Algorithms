import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String poem = br.readLine(); // 시의 내용을 입력받습니다.
        int space = Integer.parseInt(br.readLine()); // 남은 스페이스 바 사용 가능 횟수를 입력받습니다.
        int[] keyboard = new int[26]; // 알파벳 사용 가능 횟수를 저장할 배열을 만듭니다.

        String[] alphabetUsage = br.readLine().split(" "); // 알파벳 사용 가능 횟수를 입력받아 배열에 저장합니다.
        for (int i = 0; i < 26; i++) {
            keyboard[i] = Integer.parseInt(alphabetUsage[i]);
        }

        // 시 제목을 생성합니다 (각 단어의 첫 글자만 가져옵니다)
        StringBuilder ans = new StringBuilder();
        for (String word : poem.split(" ")) {
            if (!word.isEmpty()) {
                ans.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        // 시 내용의 첫 글자를 처리합니다
        char pre = poem.charAt(0);
        int preIndex = Character.toUpperCase(pre) - 'A';

        if (keyboard[preIndex] - 1 < 0) {
            System.out.println(-1);
            return;
        } else {
            keyboard[preIndex] -= 1;
        }

        // 나머지 시의 내용을 처리합니다
        for (int i = 1; i < poem.length(); i++) {
            char letter = poem.charAt(i);

            if (pre == letter) {
                continue;
            } else if (letter == ' ') {
                space--;
                if (space < 0) {
                    System.out.println(-1);
                    return;
                } else {
                    pre = letter;
                }
            } else {
                int letterIndex = Character.toUpperCase(letter) - 'A';
                if (keyboard[letterIndex] - 1 < 0) {
                    System.out.println(-1);
                    return;
                } else {
                    pre = letter;
                    keyboard[letterIndex] -= 1;
                }
            }
        }

        // 시 제목을 처리합니다
        if (ans.length() > 0) {
            pre = ans.charAt(0);
            preIndex = Character.toUpperCase(pre) - 'A';

            if (keyboard[preIndex] - 1 < 0) {
                System.out.println(-1);
                return;
            } else {
                keyboard[preIndex] -= 1;
            }

            for (int i = 1; i < ans.length(); i++) {
                char letter = ans.charAt(i);

                if (pre == letter) {
                    continue;
                } else {
                    int letterIndex = Character.toUpperCase(letter) - 'A';
                    if (keyboard[letterIndex] - 1 < 0) {
                        System.out.println(-1);
                        return;
                    } else {
                        pre = letter;
                        keyboard[letterIndex] -= 1;
                    }
                }
            }
        }

        // 최종적으로 제목을 출력합니다.
        System.out.println(ans.toString());
    }
}