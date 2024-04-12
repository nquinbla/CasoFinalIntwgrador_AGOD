package AnálisisGenómico;


public class Main_AG {
    public static void main(String[] args) {
        // Ejemplo de uso de ConteoGenes
        String cadenaADN = "ATGCTGATTAAATGCGATGATGCTAA";
        int genesContados = ConteoGenes.contarGenes(cadenaADN);
        System.out.println("Número de genes en la cadena de ADN: " + genesContados);

        // Ejemplo de uso de GeneticCombinationCalculator
        int n = 3; // Número de genes
        int combinaciones = CálculoCombGen.calcularCombGen(n);
        System.out.println("Número de combinaciones genéticas posibles para " + n + " genes: " + combinaciones);
    }
}
