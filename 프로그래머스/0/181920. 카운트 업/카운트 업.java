class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = end_num - start_num;
        int[] answer = new int[len+1];
        int idx = 0;
        for(int i=start_num; i<=end_num; i++){
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}