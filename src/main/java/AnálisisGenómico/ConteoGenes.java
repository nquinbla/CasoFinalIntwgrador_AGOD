package AnálisisGenómico;
public class ConteoGenes {
    public static int contarGenes(String dna) {
        return contarGenesRecursivamente(dna, 0);
    }

    public static int contarGenesRecursivamente(String dna, int startIndex) {
        if (startIndex >= dna.length() - 2) {
            return 0;
        }
        int startCodon = dna.indexOf("ATG", startIndex);
        if (startCodon != -1) {
            int stopCodon = dna.indexOf("TAA", startCodon + 3);
            if (stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
                return 1 + contarGenesRecursivamente(dna, stopCodon + 3);
            } else {
                return contarGenesRecursivamente(dna, startCodon + 3);
            }
        }
        return contarGenesRecursivamente(dna, startIndex + 1);
    }
}