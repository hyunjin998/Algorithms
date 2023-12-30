class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        
        for(int i=0; i<sides.length; i++){
            max = Math.max(max, sides[i]);
            sum += sides[i];
        }
        sum -= max;
        
        answer = (max < sum ? 1 : 2);
        return answer;
    }
}