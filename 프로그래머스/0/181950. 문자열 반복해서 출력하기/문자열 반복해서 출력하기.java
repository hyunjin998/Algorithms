import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();
        
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<n; i++){
            sb.append(str);
        } System.out.println(sb);
    }
}