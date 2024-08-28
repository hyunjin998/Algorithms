import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        sb.append(zonedDateTime.getYear()).append('\n').append(zonedDateTime.getMonthValue()).append('\n').append(zonedDateTime.getDayOfMonth());
        System.out.println(sb);

    }
}