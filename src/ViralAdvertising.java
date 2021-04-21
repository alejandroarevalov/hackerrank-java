public class ViralAdvertising {

    static int viralAdvertising(int n) {
        int sum = 2;
        int liked = 2;
        for (int i = 2; i <= n; i ++){
            liked = liked * 3 / 2;
            sum = sum + liked;
        }
        return sum;
    }
}
