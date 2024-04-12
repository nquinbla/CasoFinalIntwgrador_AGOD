package AnálisisGenómico;

// Clase pública para contar genes en una cadena de ADN
public class ConteoGenes {
    // Método público para contar genes en una cadena de ADN
    public static int contarGenes(String cadenaADN) {
        // Verificación de entrada válida
        if (!cadenaADN.matches("[ATGC]*")) {
            throw new IllegalArgumentException("La cadena de ADN contiene caracteres inválidos.");
        }
        // parámetros iniciales
        return contarGenesRecursivamente(cadenaADN, 0,0);
    }

    // Método auxiliar recursivo para contar genes
    private static int contarGenesRecursivamente(String cadenaADN, int index, int count) {
        if (index >= cadenaADN.length() -2 ) {
            return count;
        }
        // Si la cadena de ADN comienza con "ATG" en el índice actual
        if (cadenaADN.startsWith("ATG", index)) {
            // Busca el índice del codón de parada "TAA"
            int endIndex = findStopCodon(cadenaADN, index + 3);
            if (endIndex != -1) {
                // Incrementa el recuento y llama recursivamente al método auxiliar con el nuevo índice y recuento.
                count++;
                return contarGenesRecursivamente(cadenaADN, endIndex + 3, count);
            }
        }
        // Si no se encuentra llama recursivamente al método auxiliar.
        return contarGenesRecursivamente(cadenaADN, index + 1, count);
    }

    // Método para encontrar el índice del codón de parada "TAA" después del índice de inicio
    private static int findStopCodon(String cadenaADN, int startIndex) {
        // Busca el índice del codón de parada "TAA" después del índice de inicio
        int currIndex = cadenaADN.indexOf("TAA", startIndex);
        // Mientras se encuentre un codón de parada "TAA"
        while (currIndex != -1) {
            if ((currIndex - startIndex) % 3 == 0) { // Si la longitud del gen es un múltiplo de 3 devuelve el índice actual
                return currIndex;
            } else {
                // Si no, busca el siguiente codón de parada "TAA"
                currIndex = cadenaADN.indexOf("TAA", currIndex + 3);
            }
        }
        // Si no se encuentra un codón de parada "TAA", devuelve -1
        return -1;
    }
}