package miscelaneous;

public class AppleAndOrange {
    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int totalApples = 0;
        int totalOranges = 0;
        for (int i = 0; i < apples.length; i++) {
            if (apples[i] + a >= s && apples[i] + a <= t) {
                totalApples++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] + b >= s && oranges[i] + b <= t) {
                totalOranges++;
            }
        }
        System.out.println(totalApples);
        System.out.println(totalOranges);
    }

}
