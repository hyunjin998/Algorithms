class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        // num은 n의 배수
        if(num % n == 0) answer = 1;
        return answer;
    }
}