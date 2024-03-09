class Solution {
    public int[][] solution(int[] num_list, int n) {
        // int[][] answer = {};
        int len = num_list.length;
        int idx = 0;
        int[][] answer = new int[len/n][n];
        
        for(int i=0; i<len/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        return answer;
    }
}