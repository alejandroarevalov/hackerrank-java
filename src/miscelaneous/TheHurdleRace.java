package miscelaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        int highest = height.stream().max(Integer::compareTo).get();
        return Math.max(highest - k, 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hurdlesCount = scanner.nextInt();
        int height = scanner.nextInt();
        List<Integer> hurdles = new ArrayList<>();
        IntStream.range(0, hurdlesCount).forEach(number -> hurdles.add(number, scanner.nextInt()));
        System.out.println(hurdleRace(height, hurdles));

    }
}
