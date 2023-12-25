class Solution {
    public int solution(int angle) {
        int answer = 0;
        angle -= 90;
        answer = (angle < 0 ? 1 : angle == 0 ? 2 : angle < 90 ? 3 : 4);
        return answer;
    }
}