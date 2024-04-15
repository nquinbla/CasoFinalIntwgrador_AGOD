package AnálisisGenómico;
public class ConteoGenes {
    public static int contarGenes(String dna){
        if (dna.isEmpty()){
            return 0;
        }
        int index = dna.indexOf("ATG");
        if (index == -1){
            return 0;
        }
        return 1 + contarGenes(dna.substring(index + 3));
    }

}