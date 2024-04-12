package HerramientasAnálisisNúm;

public class SumatoriaYListadoNum {
    // Función recursiva para calcular la sumatoria de los números de 1 a n.
    public static int sumNúmeros(int n) {
        if (n == 0) { // Caso base
            return 0;
        } else { // Caso recursivo
            return n + sumNúmeros(n - 1);
        }
    }

    public static void listNúmeros(int start, int end) {
        if (start <= end) {
            System.out.println(start + "");
            listNúmeros(start + 1, end);
        }
    }
}