package HerramientasAnálisisNúm;

public class CálculoPotenciasYMáx {
    // Método para calcular la potencia de un número
    public static int calcularPotencia(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser no negativo, es decir, positivo.");
        }
        if (exponente == 0) { // Caso base: si el exponente es 0, devuelve 1
            return 1;
        } else { // Caso recursivo: devuelve la base multiplicada por la potencia de la base y el exponente - 1
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    // Método para encontrar el máximo de un arreglo
    public static int encontrarMáx (int[] arr, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El tamaño del arreglo debe ser positivo.");
        } else if (n == 1) { // Caso base: si el tamaño del arreglo es 1, devuelve el único elemento
            return arr[0];
        } else { // Caso recursivo: devuelve el máximo entre el primer elemento y el máximo del resto del arreglo
            return Math.max(arr[n - 1], encontrarMáx(arr, n - 1));
        }
    }
}
