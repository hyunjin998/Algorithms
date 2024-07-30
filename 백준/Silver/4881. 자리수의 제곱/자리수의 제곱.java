import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String[]> cases = new ArrayList<>();

        while (true) {
            String line = sc.readLine();
            String[] caseArr = line.split(" ");
            if (caseArr[0].equals("0") && caseArr[1].equals("0")) {
                break;
            }
            cases.add(caseArr);
        }

        for (String[] caseArr : cases) {
            int num1 = Integer.parseInt(caseArr[0]);
            int num2 = Integer.parseInt(caseArr[1]);
            int result = sumEach(num1, num2);
            System.out.printf("%d %d %d%n", num1, num2, result);
        }
    }

    private static int sumEach(int num1, int num2) {
        ArrayList<Integer> sequence1 = new ArrayList<>();
        ArrayList<Integer> sequence2 = new ArrayList<>();
        sequence1.add(num1);
        sequence2.add(num2);

        while (true) {
            int sum1 = 0;
            for (char c : Integer.toString(sequence1.get(sequence1.size() - 1)).toCharArray()) {
                sum1 += Math.pow(Character.getNumericValue(c), 2);
            }
            if (sequence1.contains(sum1)) {
                break;
            } else {
                sequence1.add(sum1);
            }
        }

        while (true) {
            int sum2 = 0;
            for (char c : Integer.toString(sequence2.get(sequence2.size() - 1)).toCharArray()) {
                sum2 += Math.pow(Character.getNumericValue(c), 2);
            }
            if (sequence2.contains(sum2)) {
                break;
            } else {
                sequence2.add(sum2);
            }
        }

        Set<Integer> set1 = new HashSet<>(sequence1);
        Set<Integer> set2 = new HashSet<>(sequence2);
        set1.retainAll(set2);

        if (!set1.isEmpty()) {
            int common1 = -1;
            int common2 = -1;
            for (int x : sequence1) {
                if (set2.contains(x)) {
                    common1 = x;
                    break;
                }
            }
            for (int x : sequence2) {
                if (set1.contains(x)) {
                    common2 = x;
                    break;
                }
            }
            int result1 = sequence1.indexOf(common1) + sequence2.indexOf(common1) + 2;
            int result2 = sequence1.indexOf(common2) + sequence2.indexOf(common2) + 2;
            return Math.min(result1, result2);
        } else {
            return 0;
        }
    }
}