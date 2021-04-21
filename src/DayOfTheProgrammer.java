import java.io.IOException;

public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int februaryDays = 28;
        if (year == 1918) {
            februaryDays = 15;
        }
        if (year < 1918 && year % 4 == 0) {
            februaryDays++;
        } else if (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ))){
            februaryDays++;
        }
        return Math.abs(215 + februaryDays - 256) +".09." + year;
    }

    public static void main(String[] args) throws IOException {
        int year = 1918;
        String result = dayOfProgrammer(year);
        System.out.println(result);
    }
}
