import java.util.*;

class Solution {
    static int[] array;
    static int[] sel;
    static int answer = 0;
    
    public int solution(int balls, int share) {
        array = new int[balls];
        sel = new int[share];
        
        for(int i=0; i<balls; i++){
            array[i] = i;
        }
        
        int b = balls;
        int s = share;
        
        Combi(0, 0, b, s);
         return answer;
    }
    
    public void Combi(int k, int idx, int b, int s){
        // basis part
        if(k == sel.length){
            answer++;
            return;
        }
        
        // inductive part
        for(int i=idx; i<b; i++){
            sel[k] = array[i];
            Combi(k+1, i+1, b, s);
        }
    }
}