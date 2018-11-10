import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int[] base = {10, 280, 20, 280};
        int[] base2 = {20, 280, 15, 280};
        int[] base3 = {15, 280, 10, 280};
        int a = 10;
        int b = 280;
        int length = 20;

        for (int j = 0; j < 11; j++) {

            for (int i = 0; i < length; i++) {
                triangleBase(a, b, graphics);
                a = a + 10;
            }

            a = 10;
            triangleBase(a, b, graphics);
            b = b - 10;
            length = length - 2;

        }


    }

    public static void triangleBase(int a, int b, Graphics graphics) {

        graphics.drawLine(a, b, a + 10, b);
        graphics.drawLine(a + 10, b, a + 5, b - 10); //40, 20, 35, 30
        graphics.drawLine(a + 5, b - 10, a, b); //35, 30, 30, 20
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

