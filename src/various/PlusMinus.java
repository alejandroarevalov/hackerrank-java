package various;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives++;
            } else if (arr[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }
        System.out.println(positives * 1.0 / arr.length);
        System.out.println(negatives * 1.0 / arr.length);
        System.out.println(zeros * 1.0 / arr.length);
    }
}
