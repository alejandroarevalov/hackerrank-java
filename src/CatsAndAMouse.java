public class CatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {
        Integer distanceCats[] = { Math.abs(x - z), Math.abs(y - z) };
        String winner = (distanceCats[0] - distanceCats[1]) == 0 ? "Mouse C" :
                (distanceCats[0] < distanceCats[1]) ? "Cat A" : "Cat B";
        return winner;
    }
}
