class Solution {
    public String solution(String my_string, int[][] queries) {  
        for(int[] i : queries){
            int start = i[0];
            int end = i[1];

            String str = "";
            for(int j=end; j>=start; j--){
                str += my_string.charAt(j);
            }
            my_string = my_string.substring(0, start) + str + my_string.substring(end+1, my_string.length());
        } return my_string;
    }
}