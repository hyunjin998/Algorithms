import java.io.*;
import java.util.*;

class Solution {
    public ArrayDeque<Integer> solution(int l, int r) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();
        int idx=0;
        for(int i=l; i<=r; i++){
            String str = Integer.toString(i);
            int cnt = 0;
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                if(ch=='5' || ch=='0'){
                    cnt++;
                }
                if(cnt==str.length()){
                    answer.offer(Integer.parseInt(str));
                    idx++;
                }
            }
        }
        if(idx == 0) answer.offer(-1);
        return answer;
    }
}