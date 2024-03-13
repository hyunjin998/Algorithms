import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        
        Arrays.sort(array);
        answer = array[len/2];
        return answer;
    }
}