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
        
        int idx = 0;
        for(int choice : choices) {
            char disAgree = survey[idx].charAt(0);
            char agree = survey[idx].charAt(1);
            
            if(choice < 4) hash.put(disAgree, hash.get(disAgree) + (4 - choice));
            else hash.put(agree, hash.get(agree) + (choice - 4));
            idx++;
        }
        
        answer += (hash.get('R') >= hash.get('T') ? 'R' : 'T');
        answer += (hash.get('C') >= hash.get('F') ? 'C' : 'F');
        answer += (hash.get('J') >= hash.get('M') ? 'J' : 'M');
        answer += (hash.get('A') >= hash.get('N') ? 'A' : 'N');
        
        return answer;
    }
}