package javaprep;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US).toUpperCase(Locale.ROOT);
    }

    public static void main(String[] args) {
        System.out.println(findDay(7, 27, 2022));
        System.out.println(findDay(7, 28, 2022));
        System.out.println(findDay(8, 1, 2022));
        System.out.println(findDay(1, 1, 2000));
        System.out.println(findDay(2, 29, 2004));
    }
}
