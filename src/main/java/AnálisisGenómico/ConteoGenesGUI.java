package AnálisisGenómico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConteoGenesGUI extends JFrame {
    private JTextArea textArea;

    public ConteoGenesGUI() {
        setTitle("Conteo de Genes");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton contarButton = new JButton("Contar");
        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadenaADN = textArea.getText();
                int conteo = ConteoGenes.contarGenes(cadenaADN);
                JOptionPane.showMessageDialog(null, "Número de genes: " + conteo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(new JLabel("Cadena de ADN:"));
        add(scrollPane);
        add(contarButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConteoGenesGUI().setVisible(true);
            }
        });
    }
    // Método main
    public void ejecutar() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConteoGenesGUI().setVisible(true);
            }
        });
    }
    }
