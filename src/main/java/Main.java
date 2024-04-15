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
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear un panel para agregar componentes
        JPanel panel = new DecoPanel();
        panel.setLayout(new GridBagLayout()); // Usar GridBagLayout
        panel.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panel.setOpaque(false); // Hacer que panelPrincipal sea
        panel.setPreferredSize(new Dimension(getWidth(), getHeight())); // Establecer el tamaño del panel igual al del marco principal
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
        gbc.gridy = 0;
        panel.add(tituloPrincipal, gbc);

        // Subtítulos "Análisis Genómico" y "Organización de Datos"
        JLabel subtitulo1 = new JLabel("Análisis Genómico & Organización de Datos");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        subtitulo1.setForeground(Color.BLACK);
        gbc.gridy = 1;
        panel.add(subtitulo1, gbc);

        JLabel subtitulo2 = new JLabel("Universidad Alfonso X el Sabio (UAX)");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        subtitulo2.setForeground(Color.BLUE);
        gbc.gridy = 2;
        panel.add(subtitulo2, gbc);

        // Botones del panel para interactuar con las clases
        JButton button1 = new JButton("Gestión de Fechas 📆");
        JButton button2 = new JButton("Búsqueda Eficiente en Textos \uD83D\uDD0D");
        JButton button3 = new JButton("Organización de Documentos \uD83D\uDCC4\u200B");
        JButton button4 = new JButton("Conteo de Genes 🔬");
        JButton button5 = new JButton("Cálculo de Combinaciones Genéticas 🔬🔀");
        JButton button6 = new JButton("Mejora de Algoritmos \u200B⬆\uFE0F\u200B \uD83D\uDCBB\u200B");
        JButton button7 = new JButton("Cálculo de Potencias y Máximos \uD83D\uDCAA\uD83C\uDFFC\u200B");
        JButton button8 = new JButton("Sumatoria y Listado de Números \uD83D\uDCC3\u200B➕");

        // Agregar botones al panel con las restricciones adecuadas
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 0; // Posición horizontal para los subtítulos y los primeros 4 botones
        gbc.gridy = 3; // Posición vertical para el subtítulo 1
        panel.add(subtitulo1, gbc);
        gbc.gridy = 4; // Posición vertical para el botón 1
        panel.add(button1, gbc);
        gbc.gridy = 5; // Posición vertical para el botón 2
        panel.add(button2, gbc);
        gbc.gridy = 6; // Posición vertical para el botón 3
        panel.add(button3, gbc);
        gbc.gridy = 7; // Posición vertical para el botón 4
        panel.add(button4, gbc);

        gbc.gridx = 1; // Posición horizontal para los últimos 4 botones
        gbc.gridy = 3; // Posición vertical para el subtítulo 2
        panel.add(subtitulo2, gbc);
        gbc.gridy = 4; // Posición vertical para el botón 5
        panel.add(button5, gbc);
        gbc.gridy = 5; // Posición vertical para el botón 6
        panel.add(button6, gbc);
        gbc.gridy = 6; // Posición vertical para el botón 7
        panel.add(button7, gbc);
        gbc.gridy = 7; // Posición vertical para el botón 8
        panel.add(button8, gbc);

        // Manejar eventos de los botones
        button1.addActionListener(new ActionListener() { // Gestión de Fechas
            @Override
            public void actionPerformed(ActionEvent e) {
                GestiónFechasGUI ventana = new GestiónFechasGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() { // Búsqueda Eficiente en Textos
            @Override
            public void actionPerformed(ActionEvent e) {
                BúsquedaTextosGUI ventana = new BúsquedaTextosGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() { // Organización de Documentos
            @Override
            public void actionPerformed(ActionEvent e) {
                OrganizaciónDocGUI ventana = new OrganizaciónDocGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button4.addActionListener(new ActionListener() { // Conteo de Genes
            @Override
            public void actionPerformed(ActionEvent e) {
                ConteoGenesGUI ventana = new ConteoGenesGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button5.addActionListener(new ActionListener() { // Cálculo de Combinaciones Genéticas
            @Override
            public void actionPerformed(ActionEvent e) {
                CálculoComGenGUI ventana = new CálculoComGenGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button6.addActionListener(new ActionListener() { // Mejora de Algoritmos
            @Override
            public void actionPerformed(ActionEvent e) {
                MejoraAlgoritmosGUI ventana = new MejoraAlgoritmosGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button7.addActionListener(new ActionListener() { // Cálculo de Potencias y Máximos
            @Override
            public void actionPerformed(ActionEvent e) {
                CálculoPotenciasYMáxGUI ventana = new CálculoPotenciasYMáxGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });

        button8.addActionListener(new ActionListener() { // suma y listado de números
            @Override
            public void actionPerformed(ActionEvent e) {
                SumatoriaYListadoNumGUI ventana = new SumatoriaYListadoNumGUI();
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
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