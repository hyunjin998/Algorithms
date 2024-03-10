class Solution {
    public int solution(int n) {
        int i = 1;
        while((n*i)%6 != 0) i++;
        n *= i;
        return n/6;
    }
}