import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        System.out.println(str1+str2);
    }
}