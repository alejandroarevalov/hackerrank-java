public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int partialSum = 0;
        int valleys = 0;
        boolean possibleValley = false;
        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            partialSum = step == 'U' ? partialSum + 1 : partialSum - 1;
            if (partialSum < 0) {
                possibleValley = true;
            } else if (partialSum == 0 && possibleValley) {
                valleys++;
                possibleValley = false;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8,"DDUUUUDD"));
        System.out.println(countingValleys(8,"UDDDUDUU"));
        System.out.println(countingValleys(8,"DUDUUDDU"));
    }
}
