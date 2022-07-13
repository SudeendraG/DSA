import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringToZoned {
    public static void main(String[] args) {
        final   DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        ZonedDateTime zdtWithZoneOffset = ZonedDateTime
                .parse("2022-07-11T11:21:33.598231Z", formatter);


        System.out.println(zdtWithZoneOffset);

    }
}
