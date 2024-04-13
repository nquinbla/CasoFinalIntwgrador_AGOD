import Decoración.DecoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {

        // Personalización de colores para decorar :)
        Color colorMarcoPrincipal = new Color(110, 180, 250, 98); // Azul raro
        getContentPane().setBackground(colorMarcoPrincipal); // Establece el color de fondo del marco principal

        setTitle("Sistema Interactivo de Análisis Genómico y Organización de Datos (A.G.O.D.)");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear un panel para agregar componentes
        JPanel panel = new DecoPanel();
        panelPrincipal.setLayout(new GridBagLayout()); // Usar GridBagLayout
        panelPrincipal.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panelPrincipal.setOpaque(false); // Hacer que panelPrincipal sea transparente
        add(panelPrincipal);

        // Título Principal "A.G.O.D."
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>A</font><font color='grey'>G</font><font color='blue'>O</font><font color='grey'>D</font></html>");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0;
        gbcTitulo.gridy = 0;
        gbcTitulo.weighty = 1;
        gbcTitulo.anchor = GridBagConstraints.PAGE_END;
        panelPrincipal.add(tituloPrincipal, gbcTitulo);

        // botones del panel para interactuar con las clases
        JButton button1 = new JButton("Gestión de Fechas");
        JButton button2 = new JButton("Búsqueda Eficiente en Textos");
        JButton button3 = new JButton("Organización de Documentos");
        JButton button4 = new JButton("Conteo de Genes");
        JButton button5 = new JButton("Cálculo de Combinaciones Genéticas");
        JButton button6 = new JButton("Mejora de Algoritmos");
        JButton button7 = new JButton("Cálculo de Potencias y Máximos");
        JButton button8 = new JButton("Sumatoria y Listado de Números");

        // manejar eventos de los botones
        button1.addActionListener(new ActionListener() { // Gestión de Fechas
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Gestión de Fechas");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() { // Búsqueda Eficiente en Textos
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Búsqueda Eficiente en Textos");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() { // Organización de Documentos
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Organización de Documentos");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

        button4.addActionListener(new ActionListener() { // Conteo de Genes
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Conteo de Genes");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

        button5.addActionListener(new ActionListener() { // Cálculo de Combinaciones Genéticas
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Cálculo de Combinaciones Genéticas");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

        button6.addActionListener(new ActionListener() { // Mejora de Algoritmos
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Mejora de Algoritmos");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

        button7.addActionListener(new ActionListener() { // Cálculo de Potencias y Máximos
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Cálculo de Potencias y Máximos");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

        button8.addActionListener(new ActionListener() { // Sumatoria y Listado de Números
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo marco (ventana)
                JFrame frame = new JFrame("Sumatoria y Listado de Números");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                // Crear un panel para agregar componentes
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                frame.add(panel, BorderLayout.EAST);

                // Crear un nuevo botón
                JButton button = new JButton("Regresar");

                // Manejar eventos del botón
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                    }
                });

                // Agregar el botón al panel
                panel.add(button);

                // Hacer visible el marco
                frame.setVisible(true);
            }
        });

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
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}