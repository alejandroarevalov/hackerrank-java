package miscelaneous;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s) {
        int rest = m % n;
        int result = (s - 1 + rest) % n;
        if (result == 0) {
            result = result + n;
        }
        return result;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int testCases = scanner.nextInt();
        IntStream.range(0, testCases).forEach(testCase -> {
            System.out.println(saveThePrisoner(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        });
    }
}
