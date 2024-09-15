import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 3; i > 0; i--){
            String str = sc.readLine();
            if(str.matches("-?\\d+(\\.\\d+)?")){
                int n = Integer.parseInt(str) + i;
                if(n % 3 == 0){
                    if (n % 5 == 0) sb.append("FizzBuzz");
                    else sb.append("Fizz");
                }
                else if (n % 5 == 0) sb.append("Buzz");
                else sb.append(n);
                break;
            }
        } System.out.println(sb);
    }
}