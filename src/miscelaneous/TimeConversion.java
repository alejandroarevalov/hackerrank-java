package miscelaneous;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String time[] = s.split(":");
        int hours = Integer.parseInt(time[0]);
        if (time[2].contains("P") && hours < 12) {
            hours = (hours+12)%24;
        } else if (time[2].contains("A") && hours == 12) {
            hours = 0;
        }
        time[2] = time[2].replace("PM", "");
        time[2] = time[2].replace("AM", "");
        return (hours < 10 ? "0"+hours : hours) + ":" + time[1] + ":" + time[2];
    }
}
