class Solution {

    static int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0; 
        DFS(numbers, target, 0, 0);
        return answer;
    }
    
    
    public static void DFS(int[] numbers, int target, int i, int total){
        if(i == numbers.length){
            if(total == target) answer++;
        }
        else{
            DFS(numbers, target, i+1, total + numbers[i]);
            DFS(numbers, target, i+1, total - numbers[i]);
        }
    }
}