package GestiónInfoCientífica;

public class BúsquedaTextos {
    public static int búsquedaLineal (String[] array, String texto) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(texto)) {
                return i;
            }
        }
        return -1;
    }

    public static int búsquedaBinaria (String[] array, String texto) {
        int inicio = 0;
        int fin = array.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (array[medio].equals(texto)) {
                return medio;
            } else if (array[medio].compareTo(texto) < 0) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
