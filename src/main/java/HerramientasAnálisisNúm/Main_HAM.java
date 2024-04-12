package HerramientasAnálisisNúm;
import java.util.Scanner;

public class Main_HAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la base y el exponente para calcular la potencia
        System.out.println("Ingrese la base para calcular la potencia:");
        int base = scanner.nextInt();
        System.out.println("Ingrese el exponente para calcular la potencia:");
        int exponente = scanner.nextInt();

        // Calcular y mostrar la potencia
        int potencia = CálculoPotenciasYMáx.calcularPotencia(base, exponente);
        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + potencia);

        // Solicitar al usuario el tamaño del arreglo y sus elementos para encontrar el máximo
        System.out.println("\nIngrese el tamaño del arreglo:");
        int tamaño = scanner.nextInt();
        int[] arreglo = new int[tamaño];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // Encontrar y mostrar el máximo del arreglo
        int maximo = CálculoPotenciasYMáx.encontrarMáx(arreglo, tamaño);
        System.out.println("El máximo del arreglo es: " + maximo);

        scanner.close();
    }
}
