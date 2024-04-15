package GestiónInfoCientífica;

import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class BúsquedaTextos {
    public static List<Integer> buscarPalabra(String pathToFile, String palabra) throws IOException {
        List<String> lineas = Files.readAllLines(Paths.get(pathToFile));
        List<Integer> lineasEncontradas = new ArrayList<>();
        for (int i = 0; i < lineas.size(); i++) {
            if (lineas.get(i).contains(palabra)) {
                lineasEncontradas.add(i + 1);
            }
        }
        return lineasEncontradas;
    }
}
