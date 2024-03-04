package javaprep;

import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int startsAt = sc.nextInt();
        int endsAt = sc.nextInt();

        System.out.println(input.substring(startsAt, endsAt));

    }
}
