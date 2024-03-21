package warmup;

import java.util.Scanner;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        long result = 0;
        int initialAesCount = 0;
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            if (letter == 'a') {
                initialAesCount++;
            }
        }

        result = (n/s.length()) * initialAesCount;
        long reminder = n % s.length();

        for (int i = 0; i < reminder; i++) {
            if (letters[i] == 'a') {
                result++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        long replications = scanner.nextLong();
        System.out.println(repeatedString(word, replications));
        scanner.close();
    }
}
