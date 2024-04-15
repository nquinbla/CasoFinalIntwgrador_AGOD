package GestiónInfoCientífica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestiónFechas extends JFrame {
    private List<Fecha> fechas;
    private JTextField diaField;
    private JTextField mesField;
    private JTextField añoField;
    private JTextArea textArea;

    public GestiónFechas() {
        this.fechas = new ArrayList<>();

        setTitle("Gestión de Fechas");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        diaField = new JTextField(2);
        mesField = new JTextField(2);
        añoField = new JTextField(4);
        textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dia = Integer.parseInt(diaField.getText());
                int mes = Integer.parseInt(mesField.getText());
                int año = Integer.parseInt(añoField.getText());
                fechas.add(new Fecha(dia, mes, año));
                diaField.setText("");
                mesField.setText("");
                añoField.setText("");
            }
        });

        JButton listarButton = new JButton("Listar");
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(fechas);
                textArea.setText("");
                for (Fecha fecha : fechas) {
                    textArea.append(fecha + "\n");
                }
            }
        });

        add(new JLabel("Día:"));
        add(diaField);
        add(new JLabel("Mes:"));
        add(mesField);
        add(new JLabel("Año:"));
        add(añoField);
        add(agregarButton);
        add(listarButton);
        add(scrollPane);
    }

    private class Fecha implements Comparable<Fecha> {
        private int dia;
        private int mes;
        private int año;

        public Fecha(int dia, int mes, int año) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }

        @Override
        public int compareTo(Fecha otraFecha) {
            if (this.año != otraFecha.año) {
                return this.año - otraFecha.año;
            } else if (this.mes != otraFecha.mes) {
                return this.mes - otraFecha.mes;
            } else {
                return this.dia - otraFecha.dia;
            }
        }

        @Override
        public String toString() {
            return dia + "/" + mes + "/" + año;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GestiónFechas().setVisible(true);
            }
        });
    }
}