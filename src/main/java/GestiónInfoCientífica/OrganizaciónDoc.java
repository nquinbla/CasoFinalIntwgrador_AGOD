package GestiónInfoCientífica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class OrganizaciónDoc extends JFrame {
    private JTextArea textArea;

    public OrganizaciónDoc() {
        setTitle("Organización de Documentos");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

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
                new OrganizaciónDoc().setVisible(true);
            }
        });
    }
}