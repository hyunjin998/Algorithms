class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for(int i=0; i<s; i++){
            char ch = my_string.charAt(i);
            answer += ch;
        }

        for(int i=0; i<overwrite_string.length(); i++){
            char ch = overwrite_string.charAt(i);
            answer += ch;
        }

        if(answer.length() < my_string.length()){
            for(int i=answer.length(); i<my_string.length(); i++){
                char ch = my_string.charAt(i);
                answer += ch;
            }
        }

        return answer;
    }
}