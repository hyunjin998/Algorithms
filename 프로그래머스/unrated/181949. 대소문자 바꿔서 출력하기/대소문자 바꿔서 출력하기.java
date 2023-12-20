import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();

        // 입력받은 문자열의 길이만큼 돌면서
        for(int i=0; i<a.length(); i++){
            // 명시적 형변환을 해준다
            int b = (int)a.charAt(i);
            
            char ch = 'a';
            if(65<=b && b<=90) ch = (char)(b+32);
            else if(97<=b && b<=122) ch = (char)(b-32);
            sb.append(ch);
        }

        System.out.println(sb);
    }
}