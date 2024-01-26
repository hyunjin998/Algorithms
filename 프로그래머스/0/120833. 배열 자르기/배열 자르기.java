import java.util.*;

class Solution {
    // public ArrayList<Integer> solution(int[] numbers, int num1, int num2) {
    //     ArrayList <Integer> answer = new ArrayList<>();
    //     for(int i=num1; i<=num2; i++){
    //         answer.add(numbers[i]);
    //     }
    //     return answer;
    // }
    
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int idx = 0;
        for(int i=num1; i<=num2; i++){
            answer[idx] = numbers[i];
            idx++;
        }
        return answer;
    }
}