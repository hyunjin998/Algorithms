import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int curr = 0;
        
        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);
        for(int[] target : targets){
            if(curr <= target[0]) {
                curr = target[1];
                answer++;
            }
        } return answer;
    }
}