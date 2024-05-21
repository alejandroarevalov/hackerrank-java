package mathematics.fundamentals;

import java.util.Scanner;

public class ArmyGame {

    public static int gameWithCells(int n, int m) {
        return ((n / 2) + (n % 2)) * ((m / 2) + (m % 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(gameWithCells(n, m));
        scanner.close();
    }
}
