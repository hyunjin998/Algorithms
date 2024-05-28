import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        // 배열 answer의 크기 = photo[i]의 크기
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hash = new HashMap<>();
        
        // hash에 값 넣기
        for(int i=0; i<name.length; i++){
            hash.put(name[i], yearning[i]);
        }
        
        // check
        // System.out.println(hash);
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                if(hash.containsKey(photo[i][j])){
                    int value = hash.get(photo[i][j]);
                    sum += value;
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}