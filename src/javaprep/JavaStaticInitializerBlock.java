package javaprep;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        byte b = scanner.nextByte();
        byte h = scanner.nextByte();
        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }
    }

}
