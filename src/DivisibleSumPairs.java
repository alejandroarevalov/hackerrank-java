public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        Integer sum = 0;
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
