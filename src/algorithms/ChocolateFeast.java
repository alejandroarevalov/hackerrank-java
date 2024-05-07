package algorithms;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
        int chocolates = n/c;
        int wrappers = chocolates;
        while(wrappers >= m) {
            int wrappersForChocolate = wrappers / m;
            wrappers = wrappers % m;
            chocolates = chocolates + wrappersForChocolate;
            wrappers += wrappersForChocolate;

        }
        return chocolates;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int testCases = console.nextInt();
        IntStream.range(0, testCases).forEach(index -> {
            int moneyToSpend = console.nextInt();
            int chocolateCost = console.nextInt();
            int wrappersToGetFreeChocolate = console.nextInt();
            System.out.println(chocolateFeast(moneyToSpend, chocolateCost, wrappersToGetFreeChocolate));
        });
        console.close();
    }
}
