package AnálisisGenómico;

public class ConteoGenes {
    public static int contarGenes(String genes) {
        return contarGenesHelper("dna", 0,0);
    }
    private static int contarGenesHelper(String dna, int index, int count) {
        if (index >= dna.length() -2 ) {
            return count;
        } if (dna.startsWith("ATG", index)) {
            int endIndex = findStopCodon(dna, index + 3);
            if (endIndex != -1) {
                count++;
                return contarGenesHelper(dna, endIndex + 3, count);
            }
        } return contarGenesHelper(dna, index + 1, count);
     }
     private static int findStopCodon(String dna, int startIndex) {
        int currIndex = dna.indexOf("TAA", startIndex + 3);
        while (currIndex != -1) {
            if ((currIndex - startIndex) % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dna.indexOf("TAA", currIndex + 1);
            }
        } return -1;
     }

}
