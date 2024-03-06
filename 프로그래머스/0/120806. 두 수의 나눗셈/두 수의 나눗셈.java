class Solution {
    public double solution(int num1, int num2) {
        double num = (double)num1/(double)num2 * 1000;
        double answer = Math.floor(num);
        return answer;
    }
}