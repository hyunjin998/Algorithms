class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int end = (n%2==0 ? n-1 : n);
    
        int value = 1;
        for(int i=0; value<=end; i++){
            answer[i] = value;
            value +=2;
        }
        return answer;
    }
}