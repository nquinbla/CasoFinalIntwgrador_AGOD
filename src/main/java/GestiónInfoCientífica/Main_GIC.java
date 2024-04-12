package GestiónInfoCientífica;

import java.util.Scanner;

public class Main_GIC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestiónFechas gestiónFechas = new GestiónFechas();

        // Agregar fechas
        System.out.println("¿Cuántas fechas desea agregar?");
        int numFechas = scanner.nextInt();
        for (int i = 0; i < numFechas; i++) {
            System.out.println("Ingrese el día, mes y año de la fecha " + (i + 1) + ":");
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            int año = scanner.nextInt();
            gestiónFechas.agregarFecha(dia, mes, año);
        }

        // Listar fechas
        System.out.println("Las fechas ingresadas, ordenadas, son:");
        for (String fecha : gestiónFechas.listarFechas()) {
            System.out.println(fecha);
        }

        // Búsqueda de textos
        String[] array = {"texto1", "texto2", "texto3", "texto4", "texto5"};
        System.out.println("Ingrese el texto a buscar:");
        String texto = scanner.next();
        int indexLineal = BúsquedaTextos.búsquedaLineal(array, texto);
        int indexBinaria = BúsquedaTextos.búsquedaBinaria(array, texto);
        System.out.println("El texto se encontró en el índice " + indexLineal + " con búsqueda lineal y en el índice " + indexBinaria + " con búsqueda binaria.");

        // Organización de documentos
        String[] documentos = {"documento3", "documento1", "documento2"};
        documentos = OrganizaciónDoc.organizarAlfabéticamente(documentos);
        System.out.println("Los documentos ordenados alfabéticamente son:");
        for (String documento : documentos) {
            System.out.println(documento);
        }

        scanner.close();
    }
}