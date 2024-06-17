class Solution {
    boolean solution(String s) {
        boolean answer = false;
        if(s.length() % 2 != 0) return answer;
        
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(cnt<0) return answer;
            
            char ch = s.charAt(i);
            cnt = (ch=='(' ? cnt+1 : cnt-1);
        } return answer = (cnt != 0 ? false : true);
    }
}