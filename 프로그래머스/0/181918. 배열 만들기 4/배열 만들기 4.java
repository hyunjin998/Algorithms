import java.util.*;

class Solution {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!stk.isEmpty() && stk.peek() >= arr[i]){
                stk.pop();
            } stk.add(arr[i]);
        } return stk;
    }
}