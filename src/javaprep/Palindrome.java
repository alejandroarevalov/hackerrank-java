package javaprep;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder word = new StringBuilder(scanner.next());
        String answer = word.toString().compareTo(word.reverse().toString()) == 0 ? "Yes" : "No";

        System.out.println(answer);
    }
}
