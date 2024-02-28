class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // 1. s의 길이가 홀수 -> false
        if(s.length() % 2 != 0) return !answer;
        
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '(') cnt++;
            else cnt--;
            
            // s = "())(())" 안 됨
            if(cnt<0) return !answer;
        }

        // 2. '(' 와 ')' 의 수는 똑같아야함
        if(cnt != 0) return !answer;
        return answer;
    }
}