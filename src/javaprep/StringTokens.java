package javaprep;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] result = input.split("[ !,?._'@]+");
        if (input.isEmpty()) {
            System.out.print(0);
        } else {
            System.out.println(result.length);
            Arrays.stream(result).forEach(System.out::println);
        }
        scanner.close();
    }
}
