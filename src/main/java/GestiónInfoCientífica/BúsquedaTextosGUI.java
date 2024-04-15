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
        setSize(625, 290);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String word = searchField.getText();
                if (invertedIndex.containsKey(word)) {
                    resultLabel.setText("Palabra encontrada en líneas: " + invertedIndex.get(word));
                } else {
                    resultLabel.setText("La palabra no fue encontrada en el documento.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(loadButton);
        panel.add(new JLabel("Buscar Palabra:"));
        panel.add(searchField);
        panel.add(searchButton);

        add(new JScrollPane(textArea));
        add(panel);
        add(resultLabel);

        setLocationRelativeTo(null);
        setVisible(true);
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

    private void buildInvertedIndex(java.util.List<String> lines) {
        invertedIndex.clear();
        for (int i = 0; i < lines.size(); i++) {
            String[] words = lines.get(i).split("\\W+");
            for (String word : words) {
                word = word.toLowerCase();
                if (!invertedIndex.containsKey(word)) {
                    invertedIndex.put(word, new java.util.ArrayList<Integer>());
                }
                invertedIndex.get(word).add(i + 1);
            }
        }
    }

}