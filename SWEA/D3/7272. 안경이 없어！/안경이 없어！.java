import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        String no_hole = "CEFGHIJKLMNSTUVWXYZ";
        String one_hole = "ADOPQR";
        // tow_hole is only 'B'
        
        int T = Integer.parseInt(sc.readLine());
        for(int test_case = 1; test_case<=T; test_case++){
            st = new StringTokenizer(sc.readLine());
            String preStr = st.nextToken();
            String postStr = st.nextToken();
            
            String answer = "DIFF";
            int cnt = 0;
            
            if(preStr.length() == postStr.length()) {
                for(int i=0; i<preStr.length(); i++){
                    char preChar = preStr.charAt(i);
                    char postChar = postStr.charAt(i);
                    
                    if(no_hole.contains(String.valueOf(preChar)) && no_hole.contains(String.valueOf(postChar))) cnt++;
                    else if(one_hole.contains(String.valueOf(preChar)) && one_hole.contains(String.valueOf(postChar))) cnt++;
                    else if(preStr.charAt(i) == 'B' && postStr.charAt(i) == 'B') cnt++;
                }
                if(cnt == preStr.length()) answer = "SAME";
            } sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        } System.out.println(sb);
    }
}