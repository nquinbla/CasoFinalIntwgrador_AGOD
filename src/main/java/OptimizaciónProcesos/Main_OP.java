package OptimizaciónProcesos;

import java.util.Arrays;
import java.util.Scanner;

public class Main_OP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tamaño del array
        System.out.println("Ingrese el tamaño del array:");
        int tamaño = scanner.nextInt();

        // Crear el array y solicitar al usuario que ingrese los elementos
        int[] arr = new int[tamaño];
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ordenar el array utilizando Quicksort
        MejoraAlgoritmos.quicksort(arr, 0, tamaño - 1);

        // Imprimir el array ordenado
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(arr));

        scanner.close();
    }
}