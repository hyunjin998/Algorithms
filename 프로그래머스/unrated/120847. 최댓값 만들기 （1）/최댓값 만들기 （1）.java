import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int size = numbers.length - 1;
        Arrays.sort(numbers);
        answer = numbers[size] * numbers[size-1];
        return answer;
    }
}