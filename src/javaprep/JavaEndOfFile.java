package javaprep;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println((i++) + " " + line);
        }
    }
}
