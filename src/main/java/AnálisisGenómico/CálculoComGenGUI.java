package AnálisisGenómico;

import AnálisisGenómico.CálculoCombGen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CálculoComGenGUI extends JFrame {
    private JTextField textField;

    public CálculoComGenGUI() {
        setTitle("Cálculo de Combinaciones Genéticas");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numGenes = Integer.parseInt(textField.getText());
                int combinaciones = CálculoCombGen.calcularCombGen(numGenes);
                JOptionPane.showMessageDialog(null, "Número de combinaciones: " + combinaciones, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(new JLabel("Número de genes:"));
        add(textField);
        add(calcularButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CálculoComGenGUI().setVisible(true);
            }
        });
    }
}