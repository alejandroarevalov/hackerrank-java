package various;

public class BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] arr) {
        int current = arr[0];
        int quantity = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > current) {
                current = arr[i];
                quantity = 1;
            } else if (arr[i] == current) {
                quantity++;
            }
        }
        return quantity;
    }
}
