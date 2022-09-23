package javaprep;

import java.util.Scanner;

public class JavaDataTypes {

    static void fitsInAByte(long x) {
        if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
    }

    static void fitsInAShort(long x) {
        if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
            System.out.println("* short");
        }
    }

    static void fitsInAnInt(long x) {
        if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
    }

    static void fitsInALong(long x) {
        if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
            System.out.println("* long");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                fitsInAByte(x);
                fitsInAShort(x);
                fitsInAnInt(x);
                fitsInALong(x);
            } catch (Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
