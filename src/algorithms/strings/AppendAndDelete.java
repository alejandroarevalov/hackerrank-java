package algorithms.strings;

import java.util.Scanner;

public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        String result;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);
        for (int i = 0; i < Math.min(sb.length(), tb.length()); i++) {
            if (sb.charAt(i) == tb.charAt(i)) {
                sb.deleteCharAt(i);
                tb.deleteCharAt(i);
                i--;
            } else {
                break;
            }
        }
        if ((k >= (sb.length() + tb.length()) && ((k - sb.length() - tb.length())) % 2 == 0)
                ||  k >= (s.length() + t.length())) {
            result = "Yes";
        } else {
            result = "No";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = scanner.nextInt();
        System.out.println(appendAndDelete(s, t, k));
    }
}
