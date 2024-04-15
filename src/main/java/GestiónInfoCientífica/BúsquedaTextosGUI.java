package GestiónInfoCientífica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BúsquedaTextosGUI extends JFrame {
    private JTextField searchField;
    private JTextArea textArea;
    private JButton searchButton;
    private JButton loadButton;
    private JFileChooser fileChooser;
    private JLabel resultLabel;
    private java.util.Map<String, java.util.List<Integer>> invertedIndex;


    public BúsquedaTextosGUI() {
        setTitle("Búsqueda de Textos \uD83D\uDD0D");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

       textArea = new JTextArea(10, 30);
        searchField = new JTextField(20);
        searchButton = new JButton("Buscar Palabra");
        loadButton = new JButton("Cargar Documento");
        resultLabel = new JLabel("Resultados de la búsqueda:");
        fileChooser = new JFileChooser();
        invertedIndex = new java.util.HashMap<String, java.util.List<Integer>>();

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fileChooser.showOpenDialog(BúsquedaTextosGUI.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    try {
                        java.util.List<String> lines = java.nio.file.Files.readAllLines(fileChooser.getSelectedFile().toPath());
                        textArea.setText(String.join("\n", lines));
                        buildInvertedIndex(lines);
                    } catch (java.io.IOException ex) {
                        JOptionPane.showMessageDialog(BúsquedaTextosGUI.this, "Error al cargar el archivo.");
                    }
                }
            }
        });

        add(new JLabel("Texto a buscar:"));
        add(textoField);
        add(new JLabel("Textos:"));
        add(scrollPane);
        add(buscarButton);
    }

    // Método principal para ejecutar la interfaz de usuario
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BúsquedaTextosGUI().setVisible(true);
            }
        });
    }

    // Método para realizar la búsqueda lineal
    public static int búsquedaLineal(String[] array, String texto) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(texto)) {
                return i;
            }
        }
        return -1;
    }

    // ejecución
    public void ejecutar() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BúsquedaTextosGUI().setVisible(true);
            }
        });
    }
}