package Decoración;

import javax.swing.*;
import java.awt.*;

// no es coña profe que esto es lo que más he tardado en hacer, me aparecían diecisietemil triangulos cuando solo quería decorarlo con dos líneas
public class DecoPanel extends JPanel {
    private Image imagen;

    public DecoPanel() {
        // Cargar la imagen
        ImageIcon icono = new ImageIcon("src/main/resources/image-removebg-preview (3).png"); // Reemplaza "tu_imagen.png" con el nombre de tu imagen
        imagen = icono.getImage();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Color colorlínea = new Color(54, 121, 250, 98); // Blanco semi-transparente

        // Dibujar la primera línea inclinada de izquierda a derecha
        g2d.setColor(colorlínea);
        int d = 225; // Distancia de la nueva línea a la primera
        g2d.drawLine(width / 3, 0, 0, height);

        // Rellenar el espacio entre las dos líneas
        Color colorRelleno = new Color(54, 121, 250, 98); // Azul semi-transparente
        g2d.setColor(colorRelleno);

        // Crear un polígono con los puntos de las dos líneas
        int[] xPoints = {0, width / 3, width / 3 + d, d}; // Coordenadas "x" de los puntos del polígono
        int[] yPoints = {height, 0, 0, height}; // Coordenadas "y" de los puntos del polígono
        int nPoints = 4; // Número de puntos del polígono
        g2d.fillPolygon(xPoints, yPoints, nPoints); // Dibujar y rellenar el polígono

        // Dibujar la segunda línea inclinada de izquierda a derecha equidistante de la primera
        g2d.setColor(colorlínea);
        g2d.drawLine(width / 3 + d, 0, d, height);

        // Dibujar las nuevas líneas más finas en el lado derecho
        int d2 = width / 2; // Aumentar la distancia de las nuevas líneas a la izquierda del panel
        g2d.drawLine(width / 3 + d + d2, 0, d + d2, height); // Primera línea
        g2d.drawLine(width / 3 + d + 2 * d2, 0, d + 2 * d2, height); // Segunda línea

        // Rellenar el espacio entre las nuevas líneas
        int[] xPoints2 = {width / 3 + d + d2, width / 3 + d + 2 * d2, d + 2 * d2, d + d2}; // Coordenadas "x" de los puntos del nuevo polígono
        int[] yPoints2 = {0, 0, height, height}; // Coordenadas "y" de los puntos del nuevo polígono
        g2d.fillPolygon(xPoints2, yPoints2, nPoints); // Dibujar y rellenar el nuevo polígono

        //imagen de ADN
        int x = getWidth() / 2 - imagen.getWidth(null) / 2; // Centrar la imagen en el eje x
        int y = getHeight() / 2 - imagen.getHeight(null) / 2; // Centrar la imagen en el eje y
        g2d.drawImage(imagen, x, y, null);

    }
}

//         g2d.drawImage(new ImageIcon("src/main/java/Decoración/ADN.png").getImage(), width / 3, height / 3, 200, 200, null);