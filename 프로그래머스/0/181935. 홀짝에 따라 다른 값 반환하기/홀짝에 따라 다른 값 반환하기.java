class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i+=2){
            answer += (n%2 != 0 ? i : Math.pow(i+1, 2));
        } return answer;
    }
}