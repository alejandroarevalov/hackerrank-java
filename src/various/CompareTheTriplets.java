package various;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>(2);
        int va = 0;
        int vb = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                va++;
            } else if (a.get(i) < b.get(i)) {
                vb++;
            }
        }
        scores.add(va);
        scores.add(vb);
        return scores;
    }
}
