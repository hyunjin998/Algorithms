class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        int i = 0;
        for(int j=len-1; j>=0; j--){
            answer[i] = num_list[j];
            i++;
        }
        return answer;
    }
}