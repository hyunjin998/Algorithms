class Solution {
    
    static Point startPoint;
    static int originX;
    static int originY;
    static int cnt;
    
    static class Point {
        int x;
        int y;
        
        public Point (int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        FindStartPoint(park, routes, 0, 0);
        MovingRoutesDirection(park, routes);

        answer[0] = startPoint.x;
        answer[1] = startPoint.y;
        return answer;
    }
    
    
    // 1
    public void FindStartPoint(String[] park, String[] routes, int x, int y){
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    originX = i;
                    originY = j;
                    startPoint = new Point(originX, originY);
                    
                    // check
                    // System.out.printf("originX : %d originY : %d\n", originX, originY);
                }
            }
        }
    }


    // 2
    public void MovingRoutesDirection(String[] park, String[] routes){
        for(int i=0; i<routes.length; i++){
            char opt = routes[i].charAt(0);
            int num = routes[i].charAt(2) - '0';
            
            // check
            // System.out.printf("===== opt : %c num : %d =====\n", opt, num);
            
            cnt = -1;
            switch(opt) {
                case 'N' :{
                    while(checkRange(park, routes, num) && cnt < num){
                        startPoint.x -= 1;
                    }
                    
                    if(cnt != num) startPoint.x = originX;
                    else originX = startPoint.x;
                    break;
                }
                
                case 'S' :{
                    while(checkRange(park, routes, num) && cnt < num){
                        startPoint.x += 1;
                    }
                    
                    if(cnt != num) startPoint.x = originX;
                    else originX = startPoint.x;
                    break;
                }
                    
                case 'W' : {
                    while(checkRange(park, routes, num) && cnt < num){
                        startPoint.y -= 1;
                    }
                    
                    if(cnt != num) startPoint.y = originY;
                    else originY = startPoint.y;
                    break;
                }
                    
                case 'E' : {
                    while(checkRange(park, routes, num) && cnt < num){
                        startPoint.y += 1;
                    }
                    
                    if(cnt != num) startPoint.y = originY;
                    else originY = startPoint.y;
                    break;
                }
            }
            
            // check
            // System.out.printf("> x : %d y : %d\n", startPoint.x, startPoint.y);
        }
    }
    
    // 3
    public boolean checkRange(String[] park, String[] routes, int num) {
        if(startPoint.x>=0 && startPoint.x<park.length && startPoint.y>=0 && startPoint.y<park[0].length() && park[startPoint.x].charAt(startPoint.y) != 'X'){
            // check
            // System.out.printf("starPoint.x : %d startPoint.y: %d\n", startPoint.x, startPoint.y);
            cnt++;
            return true;
        } return false;
    }
}