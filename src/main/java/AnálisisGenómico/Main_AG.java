package AnálisisGenómico;

import java.util.Scanner;

public class Main_AG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Análisis Genómico ---");

        System.out.println("Por favor, introduzca la cadena de ADN:");
        String cadenaADN = scanner.nextLine();

        System.out.println("Por favor, introduzca el número de genes:");
        int n = scanner.nextInt();

        int genesContados = ConteoGenes.contarGenes(cadenaADN);
        System.out.println("Número de genes en la cadena de ADN: " + genesContados);

        int combinaciones = CálculoCombGen.calcularCombGen(n);
        System.out.println("Número de combinaciones genéticas posibles para " + n + " genes: " + combinaciones);

        scanner.close();
    }
}
