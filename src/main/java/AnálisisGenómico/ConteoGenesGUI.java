package AnálisisGenómico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConteoGenesGUI extends JFrame {
    private JTextField inputField;
    private JButton countButton;
    private JLabel resultLabel;

    public ConteoGenesGUI() {
        setTitle("Conteo de Genes \uD83E\uDDEC\u200B");
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(20);
        countButton = new JButton("Contar Genes");
        resultLabel = new JLabel("Resultado aparecerá en otra venatana");

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadenaADN = inputField.getText();
                int conteo = ConteoGenes.contarGenes(cadenaADN);
                JOptionPane.showMessageDialog(null, "Número de genes: " + conteo, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(inputField);
        add(countButton);
        add(resultLabel);

        setLocationRelativeTo(null);
        setVisible(true);

    }
}