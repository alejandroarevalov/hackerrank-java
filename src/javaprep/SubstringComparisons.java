package javaprep;

import java.util.Scanner;

public class SubstringComparisons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toProcess = scanner.next();
        String greatest = "A";
        String smallest = "z".repeat(1000);
        int expectedSubstringLength = scanner.nextInt();

        for (int i = 0; i + expectedSubstringLength <= toProcess.length(); i++) {
            String currentSubstring = toProcess.substring(i, i + expectedSubstringLength);
            if (currentSubstring.compareTo(greatest) > 0) {
                greatest = currentSubstring;
            }
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }
        }
        System.out.println(smallest);
        System.out.println(greatest);
    }
}
