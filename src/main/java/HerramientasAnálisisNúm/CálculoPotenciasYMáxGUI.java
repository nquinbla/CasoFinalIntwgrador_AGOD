package HerramientasAnálisisNúm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CálculoPotenciasYMáxGUI extends JFrame {
    private JTextField baseField;
    private JTextField exponenteField;
    private JTextArea numerosArea;

    public CálculoPotenciasYMáxGUI() {
        setTitle("Cálculo de Potencias y Máximos ➕\u200B➖➗✖️");
        setSize(400, 270);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        baseField = new JTextField(10);
        exponenteField = new JTextField(10);
        numerosArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(numerosArea);

        JButton calcularPotenciaButton = new JButton("Calcular Potencia");
        calcularPotenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int base = Integer.parseInt(baseField.getText());
                    int exponente = Integer.parseInt(exponenteField.getText());
                    int resultado = CálculoPotenciasYMáx.calcularPotencia(base, exponente);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Potencia", JOptionPane.INFORMATION_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton encontrarMaximoButton = new JButton("Encontrar Máximo");
        encontrarMaximoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int[] numeros = Arrays.stream(numerosArea.getText().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                    int maximo = CálculoPotenciasYMáx.encontrarMáx(numeros, numeros.length);
                    JOptionPane.showMessageDialog(null, "Máximo: " + maximo, "Máximo", JOptionPane.INFORMATION_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(new JLabel("Base:"));
        add(baseField);
        add(new JLabel("Exponente:"));
        add(exponenteField);
        add(calcularPotenciaButton);
        add(new JLabel("Números (separados por espacios):"));
        add(scrollPane);
        add(encontrarMaximoButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CálculoPotenciasYMáxGUI().setVisible(true);
            }
        });
    }
}