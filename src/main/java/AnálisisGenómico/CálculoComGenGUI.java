package AnálisisGenómico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CálculoComGenGUI extends JFrame {
    private JTextField textField;

    public CálculoComGenGUI() {
        setTitle("Cálculo de Combinaciones Genéticas \uD83E\uDDEC\uD83D\uDD00\u200B");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        SwingUtilities.invokeLater(() -> new CálculoComGenGUI().setVisible(true));
    }
}