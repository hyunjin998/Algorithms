class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] visited = new boolean[n+1];
        int answer = 0;
        if(m==1) return section.length;
        
        for(int i=0; i<section.length; i++){
            int idx = section[i];
            if(!visited[idx]){
                answer += 1;
                for(int j=idx; j<idx+m; j++){
                    if(j>=section[section.length-1]) return answer;
                    visited[j] = true;
                }
            }
        } return answer;
    }
}