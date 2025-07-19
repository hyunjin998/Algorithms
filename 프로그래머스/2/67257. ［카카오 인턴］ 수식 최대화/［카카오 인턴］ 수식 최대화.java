import java.util.*;

class Solution {
    public long solution(String expression) {
        String[][] priorities = {
            {"+", "-", "*"}, {"+", "*", "-"},
            {"-", "+", "*"}, {"-", "*", "+"},
            {"*", "+", "-"}, {"*", "-", "+"}
        };
        
        List<String> tokens = Tokenize(expression);
        long answer = 0;
        
        for(String[] priority : priorities){
            List<String> copyTokens = new ArrayList<>(tokens);
            long result = Caculate(copyTokens, priority);
            answer = Math.max(answer, Math.abs(result));
        }
        return answer;
    }
    
    private List<String> Tokenize(String expression){
        List<String> tokens = new ArrayList<>();
        String str = "";
        
        for(char ch : expression.toCharArray()){
            if(ch == '+' || ch == '-' || ch == '*'){
                tokens.add(str);
                tokens.add(ch + "");
                str = "";
            }
            else str += ch;
        }
        tokens.add(str);
        return tokens;
    }
    
    private long Caculate(List<String> copyTokens, String[] priority){
        for(String operator : priority){
            for(int i=0; i<copyTokens.size(); ){
                if(copyTokens.get(i).equals(operator)){
                    long left = Long.parseLong(copyTokens.get(i-1));
                    long right = Long.parseLong(copyTokens.get(i+1));
                    long result = Caculate(left, right, operator);
                    
                    copyTokens.remove(i-1);
                    copyTokens.remove(i-1);
                    copyTokens.remove(i-1);
                    
                    copyTokens.add(i-1, Long.toString(result));
                    
                    i -= 1;
                } else i++;
            }
        }
        return Long.parseLong(copyTokens.get(0));
    }
    
    private long Caculate(long a, long b, String operator){
        return operator == "+" ? a+b : operator == "-" ? a-b : a*b;
    }
}