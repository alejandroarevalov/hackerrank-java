package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElectronicsShop {

    public static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int moneySpent = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int sum = keyboard + drive;
                if (sum > moneySpent && sum <= budget) {
                    moneySpent = keyboard + drive;
                }
            }
        }
        return moneySpent;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int budget = scanner.nextInt();
            int keyboards = scanner.nextInt();
            int drives = scanner.nextInt();
            int[] keyboardsArray = new int[keyboards];
            int[] drivesArray = new int[drives];
            for (int i = 0; i < keyboards; i++) {
                keyboardsArray[i] = scanner.nextInt();
            }
            for (int i = 0; i < drives; i++) {
                drivesArray[i] = scanner.nextInt();
            }
            System.out.println(getMoneySpent(keyboardsArray, drivesArray, budget));
        }

    }
}
