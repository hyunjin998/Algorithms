import java.io.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        if(my_string.length() < is_prefix.length()) return 0;
        
        int answer = 1;
        int len = Math.min(my_string.length(), is_prefix.length());
        
        for(int i=0; i<len; i++){
            if(my_string.charAt(i) != is_prefix.charAt(i)) answer = 0;
        } return answer;
    }
}