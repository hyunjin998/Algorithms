import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        HashMap <Integer, Character> hash = new HashMap<>();
        
        char val = 97;
        for(int i=0; i<10; i++){
            hash.put(i, val);
            val++;
        }
        
        String str = Integer.toString(age);
        for(int i=0; i<str.length(); i++){
            int key = str.charAt(i) - '0';
            answer += hash.get(key);
        }
        
        return answer;
    }
}