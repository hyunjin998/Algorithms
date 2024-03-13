class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int value = 0;
        int[] cal = new int[1001];
        
        for(int i=0; i<array.length; i++){
            cal[array[i]] += 1;
        }
        
        for(int i=0; i<cal.length; i++){
            if(value < cal[i]) {
                value = cal[i];
                answer = i;
            }
            else if (value == cal[i])
                answer = -1;
        }
        
        return answer;
    }
}