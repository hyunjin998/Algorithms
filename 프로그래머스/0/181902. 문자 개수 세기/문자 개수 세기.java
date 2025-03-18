class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            int idx = my_string.charAt(i) - '0' - 17;
            idx = (idx <= 25 ? idx : idx-6);
            answer[idx] += 1;
        } return answer;
    }
}