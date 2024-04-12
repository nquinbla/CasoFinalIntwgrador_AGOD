package OptimizaciónProcesos;


public class MejoraAlgoritmos {
    // Método para ordenar un arreglo utilizando Quicksort optimizado
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            // Particionamiento
            int pi = partition(arr, low, high);

            // Ordenar recursivamente los elementos antes y después del pivote
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    // Método para obtener el índice del pivote
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Intercambiar arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar arr[i+1] y arr[high] (o el pivote)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
