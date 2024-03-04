class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        
        for(int idx=0; idx<code.length(); idx++){
            if(!mode){  // 짝수
                if(code.charAt(idx) != '1'){
                    if(idx % 2 == 0){
                        ret += code.charAt(idx);
                    }
                }
                else mode = true;
            }
        
            else {  // 홀수
                if(code.charAt(idx) != '1'){
                    if(idx % 2 != 0){
                        ret += code.charAt(idx);
                    }
                }
                else mode = false;
            }
        }
        
        // ret이 빈 문자열일때
        if (ret == ""){
            ret = "EMPTY";
        }
        return ret;
    }
}