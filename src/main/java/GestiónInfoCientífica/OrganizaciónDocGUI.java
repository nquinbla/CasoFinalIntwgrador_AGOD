package GestiónInfoCientífica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class OrganizaciónDocGUI extends JFrame {
    private JTextArea textArea;
    private JButton loadButton;
    private JButton saveButton;
    private JButton sortButton;
    private JFileChooser fileChooser;
    private List<String> documentos;

    public OrganizaciónDocGUI() {
        setTitle("Organización de Documentos \uD83D\uDCC4\u200B");
        setSize(535, 190);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        textArea = new JTextArea(5, 20);
        loadButton = new JButton("Cargar Documento");
        saveButton = new JButton("Buscar Palabra");
        sortButton = new JButton("Organizar Documentos");
        fileChooser = new JFileChooser();

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fileChooser.showOpenDialog(OrganizaciónDocGUI.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    try {
                        documentos = Files.readAllLines(fileChooser.getSelectedFile().toPath());
                        textArea.setText(String.join("\n", documentos));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(OrganizaciónDocGUI.this, "Error al cargar el archivo.");
                    }
                }
            }
        });

        saveButton.addActionListener(e -> {
            int returnVal = fileChooser.showSaveDialog(OrganizaciónDocGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    List<String> lines = Arrays.asList(textArea.getText().split("\\n"));
                    Files.write(fileChooser.getSelectedFile().toPath(), String.join("\n", lines).getBytes());
                    JOptionPane.showMessageDialog(this, "Archivo guardado correctamente.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo.");
                }
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] documentosArray = documentos.toArray(new String[0]);
                documentosArray = OrganizaciónDoc.organizarAlfabéticamente(documentosArray);
                documentos = Arrays.asList(documentosArray);
                textArea.setText(String.join("\n", documentos));
            }
        });

        JPanel panel = new JPanel();
        panel.add(loadButton);
        panel.add(saveButton);
        panel.add(sortButton);

        add(new JScrollPane(textArea));
        add(panel);

        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrganizaciónDocGUI().setVisible(true);
            }
        });
    }
}