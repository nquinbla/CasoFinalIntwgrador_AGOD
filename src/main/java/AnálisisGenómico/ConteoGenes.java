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
     private static int

}
