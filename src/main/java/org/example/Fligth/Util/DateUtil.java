package org.example.Fligth.Util;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateUtil {
    private DateUtil() {
    }

    public static LocalDate toDepartureTime(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        return localDate;
    }

    public static String toString(LocalDate date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        return date.format(dateTimeFormatter);
    }
}