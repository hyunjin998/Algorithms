class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        for(int idx=0; idx<code.length(); idx++){
            char ch = code.charAt(idx);
            
            if(ch != '1') {
                if(idx % 2 == mode) ret += ch;
            } else mode = (mode == 0 ? 1 : 0);
        } return ret.equals("") ? "EMPTY" : ret;
    }
}