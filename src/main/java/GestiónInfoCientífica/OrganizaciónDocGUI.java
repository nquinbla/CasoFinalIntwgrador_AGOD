package GestiónInfoCientífica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        textArea = new JTextArea(5, 20);
        loadButton = new JButton("Cargar Documento");
        saveButton = new JButton("Buscar Palabra");
        sortButton = new JButton("Organizar Documentos");
        fileChooser = new JFileChooser();

        JButton organizarButton = new JButton("Organizar");
        organizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] documentos = textArea.getText().split("\n");
                documentos = organizarAlfabéticamente(documentos);
                StringBuilder resultado = new StringBuilder();
                for (String doc : documentos) {
                    resultado.append(doc).append("\n");
                }
                JOptionPane.showMessageDialog(null, resultado.toString(), "Documentos Organizados", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(new JLabel("Documentos:"));
        add(scrollPane);
        add(organizarButton);
    }

    public static String[] organizarAlfabéticamente(String[] documentos) {
        Arrays.sort(documentos);
        return documentos;
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