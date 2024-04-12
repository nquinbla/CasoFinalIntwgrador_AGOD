package GestiónInfoCientífica;

public class OrganizaciónDoc {
    public static String[] organizarAlfabéticamente(String[] documentos) {
        for (int i = 0; i < documentos.length; i++) {
            for (int j = i + 1; j < documentos.length; j++) {
                if (documentos[i].compareTo(documentos[j]) > 0) {
                    String temp = documentos[i];
                    documentos[i] = documentos[j];
                    documentos[j] = temp;
                }
            }
        }
        return documentos;
    }
}
