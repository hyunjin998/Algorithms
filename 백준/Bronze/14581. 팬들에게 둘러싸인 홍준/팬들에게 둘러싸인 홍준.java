import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(":fan::fan::fan:").append("\n");
        sb.append(":fan::").append(sc.readLine()).append("::fan:").append("\n");
        sb.append(":fan::fan::fan:");
        System.out.println(sb);
    }
}