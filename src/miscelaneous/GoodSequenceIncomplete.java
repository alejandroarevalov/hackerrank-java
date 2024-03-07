package miscelaneous;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class GoodSequenceIncomplete {

    public static int getCandidates(List<Integer> arr) {
        int total = 0;
        int count = arr.size();
        String binaryRep = "";
        List<Integer> copy = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            binaryRep = Integer.toBinaryString(i);
            int[] booleanArray = new int[binaryRep.length()];
            for (int j = 0; j < booleanArray.length; j++) {
                booleanArray[j] = Integer.parseInt(binaryRep.charAt(j) + "");
                if (booleanArray[j] == 1) {
                    copy.add(arr.get(j));
                }
            }
            if (isGoodSequence(copy)) {
                total++;
            }
        }
        return total;
    }

    public static boolean isGoodSequence(List<Integer> aList) {
        if (aList.isEmpty()) {
            return false;
        }
        Set<Integer> aSet = new HashSet<>(aList);
        if (aSet.size() != aList.size()) {
            return false;
        }
        //Find max value
        int maxElement = aSet.stream().max(Integer::compare).get();
        int minElement = aSet.stream().min(Integer::compare).get();
        //Find max value
        for (int i = minElement; i <= maxElement; i++) {
            if (!aSet.contains(i)) {
                return false;
            }
        }

        return true;
    }

    public static long countGoodSubsequences(List<Integer> arr) {
        return getCandidates(arr);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        List<Integer> elements = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            elements.add(sc.nextInt());
        }
        System.out.println(countGoodSubsequences(elements));
    }

}
