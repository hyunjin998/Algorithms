import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = people.length;
        int light = 0;
        int heavy = people.length - 1;
        int weight = 0;
        
        Arrays.sort(people);
        
        while(light < heavy){
            weight = people[light] + people[heavy];
            
            if(weight > limit) {
                heavy -= 1;
                weight = 0;
            }
            
            else {
                light += 1;
                heavy -= 1;
                answer--;
            }
        } return answer;
    }
}