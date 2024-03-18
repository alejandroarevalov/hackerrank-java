package miscelaneous;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static String checkPatternSyntax(String regex) {
        String result = "Valid";
        try {
            Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            result = "Invalid";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println(checkPatternSyntax(scanner.next()));
        }
    }
}
