package mathematics.fundamentals;

import java.util.Scanner;

public class MinimumHeightTriangle {


    public static int lowestTriangle(int base, int area) {
        int height = 1;
        while(base * height / 2 < area) {
            height++;
        }
        return height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int area = scanner.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
        scanner.close();
    }
}
