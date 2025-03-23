class Solution {
    public int[] solution(int n, int k) {
        int len = n/k;
        int num = k;
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++){
            answer[i] = num;
            num += k;
        } return answer;
    }
}