package andr7st;

import javax.swing.*;

public class Main extends JFrame {

    Demostracion demo = new Demostracion();

    Main() {
        setTitle("Andr7st | Grafica2D");
        setSize(480,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(demo);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}