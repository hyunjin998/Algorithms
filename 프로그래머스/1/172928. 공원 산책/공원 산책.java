class Solution {
    
    static Point currPos;
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

        answer[0] = currPos.x;
        answer[1] = currPos.y;
        return answer;
    }
    
    
    // 1 출발 지점 찾기
    public void FindStartPoint(String[] park, String[] routes, int x, int y){
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    originX = i;
                    originY = j;
                    currPos = new Point(originX, originY);
                    
                    // check
                    // System.out.printf("originX : %d originY : %d\n", originX, originY);
                }
            }
        }
    }


    // 2 이동하기
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
                        currPos.x -= 1;
                    }
                    
                    if(cnt != num) currPos.x = originX;
                    originX = currPos.x;
                    break;
                }
                
                case 'S' :{
                    while(checkRange(park, routes, num) && cnt < num){
                        currPos.x += 1;
                    }
                    
                    if(cnt != num) currPos.x = originX;
                    originX = currPos.x;
                    break;
                }
                    
                case 'W' : {
                    while(checkRange(park, routes, num) && cnt < num){
                        currPos.y -= 1;
                    }
                    
                    if(cnt != num) currPos.y = originY;
                    originY = currPos.y;
                    break;
                }
                    
                case 'E' : {
                    while(checkRange(park, routes, num) && cnt < num){
                        currPos.y += 1;
                    }
                    
                    if(cnt != num) currPos.y = originY;
                    originY = currPos.y;
                    break;
                }
            }
            
            // check
            // System.out.printf("> x : %d y : %d\n", currPos.x, currPos.y);
        }
    }
    
    // 3 범위체크
    public boolean checkRange(String[] park, String[] routes, int num) {
        if(currPos.x>=0 && currPos.x<park.length && currPos.y>=0 && currPos.y<park[0].length() && park[currPos.x].charAt(currPos.y) != 'X'){
            // check
            // System.out.printf("currPos.x : %d currPos.y: %d\n", currPos.x, currPos.y);
            cnt++;
            return true;
        } return false;
    }
}