package javaprep;

import java.util.Arrays;
import java.util.Scanner;

public class JavaLoops2 {

    static void javaLoops2(int a, int b, int n) {
        int allNumbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            allNumbers[i] = a;
            for (int j = 0; j <= i; j++) {
                allNumbers[i] += b * (int)Math.pow(2, j);
            }
        }
        //printing algorithm
        Arrays.stream(allNumbers).forEach(number ->
                System.out.print(number + " ")
        );
        System.out.println();
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            javaLoops2(a, b, n);
        }
        in.close();
    }
}
