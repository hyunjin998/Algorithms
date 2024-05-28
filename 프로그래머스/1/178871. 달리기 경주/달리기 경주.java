import java.util.*;
import java.io.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap <String, Integer> hash = new HashMap<>();
        
        // hash에 값 넣기
        for(int i=0; i<players.length; i++){
            hash.put(players[i], i);
        }
        
        // check
        // System.out.println(hash);
        
        for(int i=0; i<callings.length; i++){
            int value = hash.get(callings[i]);
            hash.put(players[value-1], value);
            
            String tmp = players[value-1];
            players[value-1] = players[value];
            players[value] = tmp;
            
            hash.put(callings[i], value-1);
        }
        

        // return answer;
        return players;
    }
}