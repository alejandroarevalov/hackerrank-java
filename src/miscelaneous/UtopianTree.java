package miscelaneous;

import java.util.Scanner;

public class UtopianTree {

    public static int utopianTree(int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return utopianTree(n - 1) + 1;
        } else {
            return 2 * utopianTree(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int period = scanner.nextInt();
            System.out.println(utopianTree(period));
        }
    }
}
