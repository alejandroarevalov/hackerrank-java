package various;

import java.util.List;

public class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int addition = 0;
        for(int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                addition = 5 - (grades.get(i) % 5);
                if (addition < 3) {
                    grades.set(i, grades.get(i) + addition);
                }
            }
            addition = 0;
        }
        return grades;
    }
}
