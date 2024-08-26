class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        for(int idx=0; idx<code.length(); idx++){
            char ch = code.charAt(idx);
            if(ch != '1') {
                if(!mode && idx % 2 == 0) ret += ch;
                else if(mode && idx % 2 != 0) ret += ch;
            } else mode = !mode;
        } return ret.equals("") ? "EMPTY" : ret;
    }
}