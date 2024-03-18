package miscelaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DesginerPDFViewer {

    public static int designerPdfViewer(List<Integer> heights, String word) {
        char[] charArray = word.toCharArray();
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < charArray.length; i++) {
            int x = charArray[i] - 96;
            if (heights.get(x-1) * charArray.length > result) {
                result = heights.get(x-1) * charArray.length;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> heights = new ArrayList<>(26);
        IntStream.range(0, 26).forEach(index -> heights.add(scanner.nextInt()));
        String word = scanner.next();
        System.out.println(designerPdfViewer(heights, word));

    }
}
