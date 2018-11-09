import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {


        graphics.setColor(Color.GREEN);

        int count = 10;
        int a = HEIGHT / 2; // or WIDTH/2

        int g = -20;
        int m = -20;

        int l, p;
        l = p = HEIGHT;

        int f, k, n, o;
        f = k = n = o = HEIGHT / 2;


        for (int j = 0; j < 17; j++) {

            graphics.drawLine(a, m, f, a);
            m = m + count;
            f = f + count;
            graphics.drawLine(a, l, k, a);
            k = k - count;
            l = l - count;
            graphics.drawLine(a, g, n, a);
            n = n - count;
            g = g + count;
            graphics.drawLine(a, p, o, a);
            o = o + count;
            p = p - count;
        }

           /* for (int i = 0; i < 17; i++) {

                graphics.drawLine(HEIGHT / 2, m, f, HEIGHT / 2);
                m = m + 10;
                f = f + 10;
            }


       for (int i = 0; i < 8; i++) {
            graphics.drawLine(HEIGHT / 2, l, k, HEIGHT / 2);
            k = k - 20;
            l = l - 20;

        }

        for (int i = 0; i < 8; i++) {
            graphics.drawLine(HEIGHT / 2, g, n, HEIGHT / 2);
            n = n - 20;
            g = g + 20;

        }
        for (int i = 0; i < 8; i++) {
            graphics.drawLine(HEIGHT / 2, p, o, HEIGHT / 2);
            o = o + 20;
            p = p - 20;

        }*/
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
