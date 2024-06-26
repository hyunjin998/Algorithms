class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = a + "" + b;
        String str2 = b + "" + a;
        answer = Math.max(Integer.parseInt(str1), Integer.parseInt(str2));
        return answer;
    }
}