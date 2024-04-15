package OptimizaciónProcesos;

import OptimizaciónProcesos.MejoraAlgoritmos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MejoraAlgoritmosGUI extends JFrame {
    private JTextArea numerosArea;

    public MejoraAlgoritmosGUI() {
        setTitle("Mejora de Algoritmos \uD83D\uDCBB\u200B");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        numerosArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(numerosArea);

        JButton ordenarButton = new JButton("Ordenar");
        ordenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] numeros = Arrays.stream(numerosArea.getText().split("\\s+")).mapToInt(Integer::parseInt).toArray();
                MejoraAlgoritmos.quicksort(numeros, 0, numeros.length - 1);
                JOptionPane.showMessageDialog(null, "Números ordenados: " + Arrays.toString(numeros), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(new JLabel("Números (separados por espacios):"));
        add(scrollPane);
        add(ordenarButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MejoraAlgoritmosGUI().setVisible(true);
            }
        });
    }
}