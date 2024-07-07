import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> hash = new HashMap<>();
        
        hash.put('R', 0);
        hash.put('T', 0);
        hash.put('C', 0);
        hash.put('F', 0);
        hash.put('J', 0);
        hash.put('M', 0);
        hash.put('A', 0);
        hash.put('N', 0);
        
        for(int i = 0; i < choices.length; i++) {
            char disAgree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);
            
            if(choices[i] < 4) hash.put(disAgree, hash.get(disAgree) + (4 - choices[i]));
            else hash.put(agree, hash.get(agree) + (choices[i] - 4));
        }
        
        answer += (hash.get('R') >= hash.get('T') ? 'R' : 'T');
        answer += (hash.get('C') >= hash.get('F') ? 'C' : 'F');
        answer += (hash.get('J') >= hash.get('M') ? 'J' : 'M');
        answer += (hash.get('A') >= hash.get('N') ? 'A' : 'N');
        
        return answer;
    }
}