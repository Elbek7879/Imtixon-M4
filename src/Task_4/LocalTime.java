package Task_4;

import java.time.*;
import java.util.Date;

public class LocalTime {

    public static void main(String[] args) {

        System.out.println("LocalTime: " + getLocalTime());
        System.out.println("LocalDate: " + getLocalDate());
        System.out.println("LocalDateTime: " + getLocalDateTime());
        System.out.println("ZonedDateTime: " + getZonedDateTime());
        System.out.println("Util Date: " + getUtilDate());
        System.out.println("Instant: " + getInstant());

    }

    public static java.time.LocalTime getLocalTime() {
        return java.time.LocalTime.now();
    }

    public static LocalDate getLocalDate() {
        return LocalDate.now();
    }

    public static LocalDateTime getLocalDateTime() {
        return LocalDateTime.now();
    }

    public static ZonedDateTime getZonedDateTime() {
        return ZonedDateTime.now();
    }

    public static Date getUtilDate() {
        return new Date();
    }

    public static Instant getInstant() {
        return Instant.now();
    }
}
