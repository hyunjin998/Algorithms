class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
            
            int tmp = answer[i];
            answer[i] = answer[j];
            answer[j] = tmp;
        } return answer;
    }
}