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
        panel.setLayout(new GridBagLayout()); // Usar GridBagLayout
        panel.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panel.setOpaque(false); // Hacer que panelPrincipal sea transparente
        add(panel);

        // Título Principal "A.G.O.D."
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>A</font><font color='grey'>G</font><font color='blue'>O</font><font color='grey'>D</font></html>");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0;
        gbcTitulo.gridy = 0;
        gbcTitulo.weighty = 1;
        gbcTitulo.anchor = GridBagConstraints.PAGE_END;
        panel.add(tituloPrincipal, gbcTitulo);

        // Subtítulos "Análisis Genómico" y "Organización de Datos"
        JLabel subtitulo1 = new JLabel("Análisis Genómico");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        subtitulo1.setForeground(Color.BLACK);
        GridBagConstraints gbcSubtitulo1 = new GridBagConstraints();
        gbcSubtitulo1.gridx = 0;
        gbcSubtitulo1.gridy = 1;
        gbcSubtitulo1.weighty = 0;
        gbcSubtitulo1.anchor = GridBagConstraints.PAGE_START;
        panel.add(subtitulo1, gbcSubtitulo1);

        JLabel subtitulo2 = new JLabel("Organización de Datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        subtitulo2.setForeground(Color.BLUE);
        GridBagConstraints gbcSubtitulo2 = new GridBagConstraints();
        gbcSubtitulo2.gridx = 0;
        gbcSubtitulo2.gridy = 2;
        gbcSubtitulo2.weighty = 1;
        gbcSubtitulo2.anchor = GridBagConstraints.PAGE_START;
        panel.add(subtitulo2, gbcSubtitulo2);

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

        // Crear un JLayeredPane para superponer componentes
        JLayeredPane layeredPane = new JLayeredPane();
        add(layeredPane);


        // Agregar el panel principal al JLayeredPane
        panel.setBounds(0, 0, getWidth(), getHeight());
        layeredPane.add(panel, JLayeredPane.DEFAULT_LAYER);

        // Crear un nuevo panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setOpaque(false); // Hacer que buttonPanel sea transparente

        // Agregar los botones al panel de botones
        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(button1);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(button2);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(button3);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(button4);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(button5);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(button6);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(button7);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(button8);
        buttonPanel.add(Box.createVerticalGlue());

        // Agregar el panel de botones al JLayeredPane encima del panel principal
        buttonPanel.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        layeredPane.add(buttonPanel, JLayeredPane.PALETTE_LAYER);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
}