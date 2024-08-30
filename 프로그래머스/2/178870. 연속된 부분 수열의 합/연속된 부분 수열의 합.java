class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int left = 0;
        int right = 0;
        int len = sequence.length;
        int min = len;
        int sum = 0;
        
        for(int i=0; right<len; i++){
            sum += sequence[right];
            
            while(sum > k){
                sum -= sequence[left];
                left++;
            }
            
            
            if(sum == k){
                if(min > right-left){
                    min = right-left;
                    answer[0] = left;
                    answer[1] = right;
                }
            } right++;
        } return answer;
    }
}