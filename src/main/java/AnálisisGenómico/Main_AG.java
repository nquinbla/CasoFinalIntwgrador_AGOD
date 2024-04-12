package AnálisisGenómico;

import java.util.Scanner;

public class Main_AG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Análisis Genómico ---");

        // Solicitar al usuario la cadena de ADN
        System.out.println("Por favor, introduzca la cadena de ADN:");
        String cadenaADN = scanner.nextLine();

        // Solicitar al usuario el número de genes
        System.out.println("Por favor, introduzca el número de genes:");
        int n = scanner.nextInt();

        // Calcular y mostrar el número de genes en la cadena de ADN
        int genesContados = ConteoGenes.contarGenes(cadenaADN);
        System.out.println("Número de genes en la cadena de ADN: " + genesContados);

        // Calcular y mostrar el número de combinaciones genéticas posibles
        int combinaciones = CálculoCombGen.calcularCombGen(n);
        System.out.println("Número de combinaciones genéticas posibles para " + n + " genes: " + combinaciones);

        scanner.close();
    }
}
