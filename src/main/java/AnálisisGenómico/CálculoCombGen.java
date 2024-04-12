package AnálisisGenómico;

public class CálculoCombGen {
    public static int calcularCombGen (int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 2;
        } else {
            return 2 * calcularCombGen(n - 1);
        }
    }
}
