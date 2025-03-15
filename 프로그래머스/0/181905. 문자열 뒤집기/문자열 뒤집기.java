class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String reverseStr = "";
        for(int i=e; i>=s; i--){
            reverseStr += my_string.charAt(i);
        }
        
        answer = my_string.substring(0, s) + reverseStr + my_string.substring(e+1, my_string.length());
        return answer;
    }
}