package AnálisisGenómico;

public class ConteoGenes {
    public static int contarGenes(String dna) {
        int count = 0;
        int startIndex = 0;
        while (true) {
            int startCodon = dna.indexOf("ATG", startIndex);
            if (startCodon == -1) {
                break;
            }
            int stopCodon = dna.indexOf("TAA", startCodon + 3);
            if (stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
                count++;
                startIndex = stopCodon + 3;
            } else {
                startIndex = startCodon + 3;
            }
        }
        return count;
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