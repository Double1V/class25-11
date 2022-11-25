public class Square {
    public static boolean isSquare(int n) {
        for (int i = 0; i <= (int) (Math.sqrt(n)); i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false; // fix me!
    }
}