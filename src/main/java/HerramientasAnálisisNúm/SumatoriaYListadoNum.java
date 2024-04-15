package HerramientasAnálisisNúm;

public class SumatoriaYListadoNum {
    // Método para calcular la sumatoria de los números desde 1 hasta n
    public static int calcularSumatoria(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo, es decir, positivo.");
        } if (n == 0) { // Caso base: si n es 0, devuelve 0
            return 0;
        } else { // Caso recursivo: devuelve n más la sumatoria de n - 1
            return n + calcularSumatoria(n - 1);
        }
    }

    // Método para listar los números desde el inicio hasta el final
    public static void listarNumeros(int inicio, int fin, StringBuilder sb) {
        if (inicio > fin) {
            return;
        } else {
            sb.append(inicio).append(" ");
            listarNumeros(inicio + 1, fin, sb);
        }
    }
}