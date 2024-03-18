package miscelaneous;

import java.util.Scanner;

public class MaximizingXOR {

    public static int maximizingXor(int l, int r) {
        int result = Integer.MIN_VALUE;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                int xor = i ^ j;
                if (xor > result) {
                    result = xor;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(maximizingXor(l, r));
    }
}
