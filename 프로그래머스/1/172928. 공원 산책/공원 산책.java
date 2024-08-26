class Solution {
    
    static int startX = 0;
    static int startY = 0;
    static int moveX = 0;
    static int moveY = 0;
    
    public int[] solution(String[] park, String[] routes) {
        
        FindStartPoint(park);
        
        for(String route : routes){
            String dir = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);
            
            moveX = startX;
            moveY = startY;
            
            if(!MovingRoutesDirection(park, dir, move)){
                moveX = startX;
                moveY = startY;
            } else {
                startX = moveX;
                startY = moveY;
            }
        }
        return new int[] {startX, startY};
    }
    
    
    public void FindStartPoint(String[] park) {
        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){
                startX = i;
                startY = park[i].indexOf("S");
                return;
            }
        }
    }
    
    public boolean MovingRoutesDirection(String[] park, String dir, int move){
        for(int i=0; i<move; i++){
            switch(dir){
                case "N": moveX--; break;
                case "S": moveX++; break;
                case "W": moveY--; break;
                case "E": moveY++; break;
            }
            
            if(!CheckRange(park)){
                return false;
            }
        }
        return true;
    }
    
    public boolean CheckRange(String[] park){
        return (moveX >= 0 && moveX < park.length && moveY >= 0 && moveY < park[0].length() && park[moveX].charAt(moveY) != 'X');
    }
}