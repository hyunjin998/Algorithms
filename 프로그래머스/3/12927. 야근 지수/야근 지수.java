import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works){
            pq.add(work);
        }
        
        // 야근
        while(n > 0){
            int max = pq.poll();
            if(max == 0) break;
            max -= 1;
            pq.add(max);
            n--;
        }
        
        // 피로도
        long answer = 0;
        while(!pq.isEmpty()){
            answer += Math.pow(pq.poll(), 2);
        }
        
        return answer;
    }
}