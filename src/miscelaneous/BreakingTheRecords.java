package miscelaneous;

public class BreakingTheRecords {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int max = scores[0], min = scores[0];
        int broken[] = new int[2];
        broken[0] = 0;
        broken[1] = 0;
        for(int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                broken[1]++;
                min = scores[i];
            } else if (scores[i] > max){
                broken[0]++;
                max = scores[i];
            } else {
                continue;
            }
        }
        return broken;
    }

}
