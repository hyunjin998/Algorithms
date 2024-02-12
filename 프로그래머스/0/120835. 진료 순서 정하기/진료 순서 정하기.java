class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        boolean[] visited = new boolean[len];
        
        int order = 1;
        int idx = 0;
        
        for(int i=0; i<len; i++){
            int max = 0;
            for(int j=0; j<len; j++){
                if(max < emergency[j] && !visited[j]){
                    max = emergency[j];
                    idx = j;
                }
            }
            answer[idx] = order;
            visited[idx] = true;
            order++;
            // System.out.println(max + " " + idx + " " + emergency[idx]);
        }
        return answer;
        
        // return answer;
    }
}