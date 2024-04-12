package GestiónInfoCientífica;

public class OrganizaciónDoc {
    // Organiza los documentos alfabéticamente
    public static String[] organizarAlfabéticamente(String[] documentos) {
        for (int i = 0; i < documentos.length; i++) { // Ordena los documentos
            for (int j = i + 1; j < documentos.length; j++) { // Si el documento i es mayor al documento j, se intercambian
                if (documentos[i].compareTo(documentos[j]) > 0) { // Compara los documentos
                    String temp = documentos[i];
                    documentos[i] = documentos[j];
                    documentos[j] = temp;
                }
            }
        }
        return documentos; // Devuelve los documentos ordenados
    }
}
