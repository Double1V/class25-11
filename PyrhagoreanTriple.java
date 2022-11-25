import java.util.Arrays;

public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple) {
        if (((triple[0] * triple[0] + triple[1] * triple[1]) == (triple[2] * triple[2])) ||
                ((triple[1] * triple[1] + triple[2] * triple[2]) == (triple[0] * triple[0])) ||
                ((triple[2] * triple[2] + triple[1] * triple[1]) == (triple[0] * triple[0]))) {
            return 1;
        }
        return 0;
    }
