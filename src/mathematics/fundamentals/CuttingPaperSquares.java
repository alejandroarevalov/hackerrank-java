package mathematics.fundamentals;

import java.util.Scanner;

public class CuttingPaperSquares {

    public static long cuttingPaperSquares(int n, int m) {
        return ((long) n * (long) m) - 1L;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
        System.out.println(cuttingPaperSquares(n, m));
    }
}
