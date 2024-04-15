
import AnálisisGenómico.*;
import Decoración.*;
import GestiónInfoCientífica.*;
import HerramientasAnálisisNúm.*;
import OptimizaciónProcesos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {

        // Personalización de colores para decorar :)
        Color colorMarcoPrincipal = new Color(110, 180, 250, 98); // Azul raro
        getContentPane().setBackground(colorMarcoPrincipal); // Establece el color de fondo del marco principal

        // Configurar el marco principal
        setTitle("Sistema Interactivo de Análisis Genómico y Organización de Datos (A.G.O.D.)");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear un panel para agregar componentes
        JPanel panel = new DecoPanel();
        panel.setLayout(new GridBagLayout()); // Usar GridBagLayout
        panel.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panel.setOpaque(false); // Hacer que panelPrincipal sea transparente
        add(panel);

        // Configurar restricciones para el diseño de cuadrícula
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(5, 5, 5, 5); // Margen entre componentes

        // Título Principal "A.G.O.D."
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>A.</font><font color='grey'>G.</font><font color='blue'>O.</font><font color='grey'>D.</font></html>");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        tituloPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el título
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(tituloPrincipal, gbc);

        // Subtítulos "Análisis Genómico" y "Organización de Datos"
        JLabel subtitulo1 = new JLabel("Análisis Genómico & Organización de Datos");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        subtitulo1.setForeground(Color.BLACK);
        panel.add(subtitulo1, gbc);

        JLabel subtitulo2 = new JLabel("Universidad Alfonso X el Sabio (UAX)");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        subtitulo2.setForeground(Color.BLUE);
        panel.add(subtitulo2, gbc);

        // Botones del panel para interactuar con las clases
        JButton button1 = new JButton("Gestión de Fechas");
        JButton button2 = new JButton("Búsqueda Eficiente en Textos");
        JButton button3 = new JButton("Organización de Documentos");
        JButton button4 = new JButton("Conteo de Genes");
        JButton button5 = new JButton("Cálculo de Combinaciones Genéticas");
        JButton button6 = new JButton("Mejora de Algoritmos");
        JButton button7 = new JButton("Cálculo de Potencias y Máximos");
        JButton button8 = new JButton("Sumatoria y Listado de Números");


        // Agregar botones al panel con las restricciones adecuadas
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.weightx = 1.0; // Hacer que los botones ocupen todo el espacio horizontal disponible
        panel.add(button1, gbc);
        panel.add(button2, gbc);
        panel.add(button3, gbc);
        panel.add(button4, gbc);
        panel.add(button5, gbc);
        panel.add(button6, gbc);
        panel.add(button7, gbc);
        panel.add(button8, gbc);

        // Manejar eventos de los botones
        button1.addActionListener(new ActionListener() { // Gestión de Fechas
            @Override
            public void actionPerformed(ActionEvent e) {
                new GestiónFechas().setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() { // Búsqueda Eficiente en Textos
            @Override
            public void actionPerformed(ActionEvent e) {
                new BúsquedaTextos().setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() { // Organización de Documentos
            @Override
            public void actionPerformed(ActionEvent e) {
                new OrganizaciónDoc().setVisible(true);
            }
        });

        button4.addActionListener(new ActionListener() { // Conteo de Genes
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConteoGenesGUI().setVisible(true);
            }
        });

        button5.addActionListener(new ActionListener() { // Cálculo de Combinaciones Genéticas
            @Override
            public void actionPerformed(ActionEvent e) {
                new CálculoComGenGUI().setVisible(true);
            }
        });

        button6.addActionListener(new ActionListener() { // Mejora de Algoritmos
            @Override
            public void actionPerformed(ActionEvent e) {
                new MejoraAlgoritmosGUI().setVisible(true);
            }
        });

        button7.addActionListener(new ActionListener() { // Cálculo de Potencias y Máximos
            @Override
            public void actionPerformed(ActionEvent e) {
                new CálculoPotenciasYMáxGUI().setVisible(true);
            }
        });

        button8.addActionListener(new ActionListener() { // Sumatoria y Listado de Números
            @Override
            public void actionPerformed(ActionEvent e) {
                new SumatoriaYListadoNumGUI().setVisible(true);
            }
        });

        // Centrar el marco en la pantalla
        setLocationRelativeTo(null);
    }

    // Método main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
