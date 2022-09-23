package javaprep;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    static String currencyFormatter(double payment, Locale locale) {
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        return decimalFormat.format(payment);
    }

    static Locale createIndiaLocate() {
        return new Locale.Builder()
                .setLanguage("en")
                .setRegion("IN")
                .build();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double payment = scanner.nextDouble();
        scanner.close();
        String us = currencyFormatter(payment, Locale.US);
        String india = currencyFormatter(payment, createIndiaLocate());
        String china = currencyFormatter(payment, Locale.CHINA);
        String france = currencyFormatter(payment, Locale.FRANCE);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
