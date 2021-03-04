package andr7st;

import java.awt.*;
import javax.swing.JPanel;

public class Demostracion extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        this.setBackground(Color.BLACK);

        Graphics2D g2D = (Graphics2D) g;

        //// Dibujando una linea:
        // g2D.setColor(Color.MAGENTA);
        // g2D.setStroke(new BasicStroke(10)); // Grosor de la linea
        // g2D.drawLine(0, 0, 400, 400);


        //// Dibujando  multilinea:
        int xPoints[] = { 50, 10, 150, 200, 250, 300, 350 };
        int yPoints[] = { 300, 250, 275, 200, 275, 150, 100 };
        int nPoints   = xPoints.length;

        g2D.setColor(Color.GREEN);
        g2D.setStroke(new BasicStroke(2)); // Grosor de la linea
        g2D.drawPolyline(xPoints, yPoints, nPoints);

        g2D.setFont(new Font("Fira Code", Font.BOLD, 22));
        g2D.setColor(Color.GREEN);
        g2D.drawString("STONKS",100,100);

        // video 12:12


    }

}
