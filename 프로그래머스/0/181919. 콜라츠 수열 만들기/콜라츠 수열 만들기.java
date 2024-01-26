import java.util.*;
import java.io.*;

class Solution {
    public ArrayDeque<Integer> solution(int n) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();
        answer.offer(n);
        
        while(n != 1){
            n = (n%2 == 0 ? n/2 : 3*n+1);
            answer.add(n);
        }
        return answer;
    }
}