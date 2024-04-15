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
    public static int contarGenesRecursivamente(String dna, int index){
        if (index >= dna.length()){
            return 0;
        }
        if (dna.startsWith("ATG", index)){
            int fin = dna.indexOf("TAG", index);
            if ((fin - index) % 3 == 0){
                return 1 + contarGenesRecursivamente(dna, fin + 3);
            }
        }
        return contarGenesRecursivamente(dna, index + 1);
    }
}