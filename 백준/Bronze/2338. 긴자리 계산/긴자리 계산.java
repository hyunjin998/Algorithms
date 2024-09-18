import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        BigInteger A = new BigInteger(sc.readLine());
        BigInteger B = new BigInteger(sc.readLine());

        sb.append(A.add(B)).append('\n').append(A.subtract(B)).append('\n').append(A.multiply(B));
        System.out.println(sb);
    }
}