import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo marco (ventana)
        JFrame frame = new JFrame("Main GUI");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Crear un panel para agregar componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel, BorderLayout.EAST);

        // Crear botones para cada clase
        JButton button1 = new JButton("Gestión de Fechas");
        JButton button2 = new JButton("Búsqueda Eficiente en Textos");
        JButton button3 = new JButton("Organización de Documentos");
        JButton button4 = new JButton("Conteo de Genes");
        JButton button5 = new JButton("Cálculo de Combinaciones Genéticas");
        JButton button6 = new JButton("Mejora de Algoritmos");
        JButton button7 = new JButton("Cálculo de Potencias y Máximos");
        JButton button8 = new JButton("Sumatoria y Listado de Números");

        // Agregar un escuchador de eventos a cada botón
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí iría el código para interactuar con la clase GestiónFechas
            }
        });

        // Repetir para los demás botones...

        // botones del panel
        panel.add(Box.createVerticalGlue());
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button2);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button3);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button4);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button5);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button6);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button7);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button8);
        panel.add(Box.createVerticalGlue());
        panel.add(Box.createRigidArea(new Dimension(10, 0))); // Agregar espacio a la derecha de los botones

        // Hacer visible el marco
        frame.setVisible(true);
    }
}