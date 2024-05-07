package algorithms.strings;

import java.util.Scanner;

public class MarsExploration {

    public static int checkSOSOnSubstring(String subString){
        String expectedString = "SOS";
        int differentCharacters = 0;
        for (int i = 0; i < subString.length(); i++) {
            if (subString.charAt(i) != expectedString.charAt(i)) {
                differentCharacters++;
            }
        }
        return differentCharacters;
    }

    public static int marsExploration(String s) {

        int accumulated = 0;
        for (int j = 0; j < s.length(); j += 3) {
            String subString = s.substring(j, j + 3);
            accumulated += checkSOSOnSubstring(subString);
        }
        return accumulated;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println(marsExploration(input));
        console.close();
    }
}
