import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        if(s.length() % 2 != 0) return false;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch != '(') {
                if(i==0 && ch == ')') return false;
                else {
                    if(stack.isEmpty()) return false;
                    else stack.pop();
                }
            } else stack.add(ch);
        } return stack.isEmpty() ? true : false;
    }
}