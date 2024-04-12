package GestiónInfoCientífica;

public class BúsquedaTextos {
    // Método que busca un texto en un array de textos
    public static int búsquedaLineal (String[] array, String texto) {
        for (int i = 0; i < array.length; i++) { // Recorremos el array
            if (array[i].equals(texto)) { // Si encontramos el texto
                return i; // Devolvemos la posición
            }
        }
        return -1;
    }

    // Método que busca un texto en un array de textos ordenado
    public static int búsquedaBinaria (String[] array, String texto) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) { // Mientras que el inicio sea menor o igual que el final
            int medio = (inicio + fin) / 2; // Calculamos el punto medio
            if (array[medio].equals(texto)) { // Si encontramos el texto
                return medio; // Devolvemos la posición
            } else if (array[medio].compareTo(texto) < 0) { // Si el texto está en la mitad derecha
                inicio = medio + 1; // Actualizamos el inicio
            } else { // Si el texto está en la mitad izquierda
                fin = medio - 1; // Actualizamos el final
            }
        }
        return -1; // Si no encontramos el texto, devolvemos -1
    }
}
