package AnálisisGenómico;

// Clase pública para calcular el número de combinaciones genéticas
public class CálculoCombGen {
    public static int calcularCombGen (int n) {
        if (n == 0) { // Si n es 0, devuelve 1
            return 1;
        } else if (n == 1) { // Si n es 1, devuelve 2
            return 2;
        } else { // Si n es mayor que 1, devuelve 2 * calcularCombGen(n - 1)
            return 2 * calcularCombGen(n - 1);
        }
    }
}
