import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String str : intStrs){
            String num = "";
            for(int i=s; i<s+l; i++){
                num += str.charAt(i);
            }
            
            int result = Integer.parseInt(num);
            if(result > k) list.add(result);
        } return list;
    }
}