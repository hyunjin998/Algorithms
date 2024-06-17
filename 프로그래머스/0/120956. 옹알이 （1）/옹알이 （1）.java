class Solution {
    public int solution(String[] babbling) {
        int answer = babbling.length;
        String[] available = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<available.length; j++){
                if(babbling[i].contains(available[j])){
                    babbling[i] = babbling[i].replace(available[j], " ");
                }
            }
            
            for(int j=0; j<babbling[i].length(); j++){
                if(babbling[i].charAt(j) != ' ') {
                    answer--;
                    break;
                }
            }
        } return answer;
    }
}