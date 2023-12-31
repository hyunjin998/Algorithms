class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            int num = my_string.charAt(i) - '0';
            if(1 <= num && num <= 9)
                answer += num;
        }
        return answer;
    }
}