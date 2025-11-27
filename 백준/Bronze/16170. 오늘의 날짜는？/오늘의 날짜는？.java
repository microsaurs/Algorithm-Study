import java.time.ZonedDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));
        
        System.out.println(utcTime.getYear());
        System.out.println(utcTime.getMonthValue());
        System.out.println(utcTime.getDayOfMonth());
    }
}