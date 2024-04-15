package AnálisisGenómico;

public class ConteoGenes {
    public static int contarGenes(String cadenaADN) {
        if (cadenaADN.length() < 3) {
            return 0;
        }
        if (cadenaADN.startsWith("ATG")) {
            int endIndex = cadenaADN.indexOf("TAA", 3);
            if (endIndex != -1 && (endIndex - 3) % 3 == 0) {
                return 1 + contarGenes(cadenaADN.substring(endIndex + 3));
            }
        }
        return contarGenes(cadenaADN.substring(1));
    }

    private static int contarGenesRecursivamente(String cadenaADN, int index, int count) {
        if (index >= cadenaADN.length() -2 ) {
            return count;
        }
        if (cadenaADN.startsWith("ATG", index)) {
            int endIndex = findStopCodon(cadenaADN, index + 3);
            if (endIndex != -1) {
                count++;
                return contarGenesRecursivamente(cadenaADN, endIndex + 3, count);
            }
        }
        return contarGenesRecursivamente(cadenaADN, index + 1, count);
    }

    private static int findStopCodon(String cadenaADN, int startIndex) {
        int currIndex = cadenaADN.indexOf("TAA", startIndex);
        while (currIndex != -1) {
            if ((currIndex - startIndex) % 3 == 0) {
                return currIndex;
            } else {
                currIndex = cadenaADN.indexOf("TAA", currIndex + 3);
            }
        }
        return -1;
    }
}