import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a==b && b==c && c==d) answer = 1111*a;
        
        else if(a==b && b==c) answer = (int)Math.pow(10*a + d, 2);
        else if(a==b && b==d) answer = (int)Math.pow(10*a + c, 2);
        else if(a==c && c==d) answer = (int)Math.pow(10*a + b, 2);
        else if(b==c && c==d) answer = (int)Math.pow(10*b + a, 2);
        
        else if(a==b){
            if(c==d) answer = (a+c) * Math.abs(a-c);
            else answer = c*d;
        }
        else if(a==c){
            if(b==d) answer = (a+b) * Math.abs(a-b);
            else answer = b*d;
        }
        else if(a==d){
            if(b==c) answer = (a+b) * Math.abs(a-b);
            else answer = b*c;
        }
        else if(c==d){
            if(a==b) answer = (c+a) * Math.abs(c-a);
            else answer = a*b;
        }
        else if(b==d){
            if(a==c) answer = (b+a) * Math.abs(b-a);
            else answer = a*c;
        }
        else if(b==c){
            if(a==d) answer = (b+a) * Math.abs(b-a);
            else answer = a*d;
        }
        
        else {
            answer = Math.min(a,b);
            answer = Math.min(answer, c);
            answer = Math.min(answer, d);
        }
        return answer;
    }
}