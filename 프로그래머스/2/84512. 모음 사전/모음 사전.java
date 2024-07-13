class Solution {
    private static final char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    private int cnt = -1;
    private int result = 0;
    private boolean found = false;

    public int solution(String word) {
        DFS(word, "");
        return result;
    }

    private void DFS(String word, String curr) {
        if (curr.length() > 5 || found) return;

        cnt++;
        
        if (curr.equals(word)) {
            result = cnt;
            found = true;
            return;
        }
        
        for(int i=0; i<vowel.length; i++){
            char ch = vowel[i];
            DFS(word, curr+ch);
        }
    }
}
