import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = wallpaper.length;
        int maxX = 0;
        int minY = wallpaper[0].length();
        int maxY = 0;
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    minX = Math.min(minX, i);
                    maxX = Math.max(maxX, i);
                    minY = Math.min(minY, j);
                    maxY = Math.max(maxY, j);
                }
            }
        } return new int[] {minX, minY, maxX+1, maxY+1};
    }
}