import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, 1000001);
        
        for(int i=0; i<queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s; j<=e; j++){
                if(arr[j] > k){
                    answer[i] = Math.min(answer[i], arr[j]);
                    // System.out.println("j: " + j + " answer[i]: " + answer[i]);
                }
            }
            
            if(answer[i] == 1000001) answer[i] = -1;
        }
        return answer;
    }
}