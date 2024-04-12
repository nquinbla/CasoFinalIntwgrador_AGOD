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

}
