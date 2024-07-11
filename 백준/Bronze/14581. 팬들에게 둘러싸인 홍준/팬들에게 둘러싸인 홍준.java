import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(":fan::fan::fan:").append("\n");
        sb.append(":fan::").append(sc.next()).append("::fan:").append("\n");
        sb.append(":fan::fan::fan:");
        System.out.println(sb);
    }
}