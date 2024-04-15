package GestiónInfoCientífica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BúsquedaTextosGUI extends JFrame {
    private JTextField textoField;
    private JTextArea textArea;

    public BúsquedaTextosGUI() {
        setTitle("Búsqueda de Textos");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        textoField = new JTextField(20);
        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton buscarButton = new JButton("Buscar");
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textoField.getText();
                String[] array = textArea.getText().split("\n");
                int resultado = búsquedaLineal(array, texto);
                if (resultado != -1) {
                    JOptionPane.showMessageDialog(null, "Texto encontrado en la línea " + (resultado + 1), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Texto no encontrado.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(new JLabel("Texto a buscar:"));
        add(textoField);
        add(new JLabel("Textos:"));
        add(scrollPane);
        add(buscarButton);
    }

    // Método principal para ejecutar la interfaz de usuario
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BúsquedaTextosGUI().setVisible(true);
            }
        });
    }

    // Método para realizar la búsqueda lineal
    public static int búsquedaLineal(String[] array, String texto) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(texto)) {
                return i;
            }
        }
        return -1;
    }

    // ejecución
    public void ejecutar() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BúsquedaTextosGUI().setVisible(true);
            }
        });
    }
}