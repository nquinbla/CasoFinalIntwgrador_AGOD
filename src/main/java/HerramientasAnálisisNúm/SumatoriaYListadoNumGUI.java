package HerramientasAnálisisNúm;

import HerramientasAnálisisNúm.SumatoriaYListadoNum;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumatoriaYListadoNumGUI extends JFrame {
    private JTextField numField;
    private JTextField inicioField;
    private JTextField finField;

    public SumatoriaYListadoNumGUI() {
        setTitle("Sumatoria y Listado de Números");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        numField = new JTextField(10);
        inicioField = new JTextField(10);
        finField = new JTextField(10);

        JButton calcularSumatoriaButton = new JButton("Calcular Sumatoria");
        calcularSumatoriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(numField.getText());
                int resultado = SumatoriaYListadoNum.calcularSumatoria(num);
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Sumatoria", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton listarNumerosButton = new JButton("Listar Números");
        listarNumerosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inicio = Integer.parseInt(inicioField.getText());
                int fin = Integer.parseInt(finField.getText());
                SumatoriaYListadoNum.listarNumeros(inicio, fin);
            }
        });

        add(new JLabel("Número para sumatoria:"));
        add(numField);
        add(calcularSumatoriaButton);
        add(new JLabel("Inicio para listado:"));
        add(inicioField);
        add(new JLabel("Fin para listado:"));
        add(finField);
        add(listarNumerosButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SumatoriaYListadoNumGUI().setVisible(true);
            }
        });
    }
}