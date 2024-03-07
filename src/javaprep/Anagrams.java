package javaprep;

import java.sql.PseudoColumnUsage;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {

    static Map<Character, Integer> getFrecuencyMap(String aString) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < aString.length(); i++) {
            Character c = aString.charAt(i);
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                hashMap.replace(c, hashMap.get(c) + 1);
            }
        }
        return hashMap;
    }
    static boolean isAnagram(String x, String y) {
        Map<Character, Integer> hashMapX = getFrecuencyMap(x);
        Map<Character, Integer> hashMapY = getFrecuencyMap(y);
        return hashMapX.equals(hashMapY);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next().toLowerCase();
        String b = scanner.next().toLowerCase();
        boolean isAnagram = isAnagram(a, b);
        String output = isAnagram ? "Anagrams" : "Not Anagrams";
        System.out.println(output);
    }
}
