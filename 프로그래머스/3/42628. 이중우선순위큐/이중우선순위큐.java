import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        for(String str : operations){
            switch(str){
                case "D 1": {
                    if(!max.isEmpty()) {
                        int val = max.poll();
                        min.remove(val);
                    }
                    break;
                }
                case "D -1": {
                    if(!min.isEmpty()) {
                        int val = min.poll();
                        max.remove(val);
                    }
                    break;
                }
                default: {
                    max.offer(Integer.parseInt(str.substring(2, str.length())));
                    min.offer(Integer.parseInt(str.substring(2, str.length())));
                    break;
                }
            }
        }
        
        return max.isEmpty() && min.isEmpty() ? new int[] {0, 0}
        : new int[] {max.poll(), min.poll()};
    }
}