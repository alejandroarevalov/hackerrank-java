import java.util.Arrays;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {
        Long onTimeStudents = Arrays.stream(a).filter(x -> x <= 0L).count();
        String decided = (onTimeStudents < k) ? "YES" : "NO";
        return decided;
    }
}
