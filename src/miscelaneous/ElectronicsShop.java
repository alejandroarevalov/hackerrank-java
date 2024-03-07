package miscelaneous;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxValue = -1;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int sum = keyboard + drive;
                if (sum > maxValue && sum <= b) {
                    maxValue = sum;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        short keyBoards = scanner.nextShort();
        short drives = scanner.nextShort();
        int[] keyboardPrices = new int[keyBoards];
        int[] drivesPrices = new int[drives];

        for (int i = 0; i < keyBoards; i++) {
            keyboardPrices[i] = scanner.nextInt();
        }

        for (int i = 0; i < drives; i++) {
            drivesPrices[i] = scanner.nextInt();
        }

        System.out.println(getMoneySpent(keyboardPrices, drivesPrices, budget));

    }
}
