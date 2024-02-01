import java.util.*;

// 가위 : 2
// 바위 : 0
// 보 : 5

class Solution {
    public String solution(String rsp) {
        HashMap <Character, Integer> hash = new HashMap<>();
        hash.put('2', 0);
        hash.put('0', 5);
        hash.put('5', 2);
        
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            answer += hash.get(rsp.charAt(i));
        }
        return answer;
    }
}