import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y = 0;
        centerLine(x, y, graphics);

    }

    public static void centerLine(int x, int y, Graphics graphics) {
        graphics.setColor(Color.RED);
        int xCenter = 160;
        int yCenter = 160;


        for (int j = 0; j < WIDTH; j++) {
            x = 0;
            y = 0;

            for (int i = 0; i < WIDTH / 20; i++) {
                graphics.drawLine(x, y, 160, 160);
                x = x + 20;
            }


            for (int i = 0; i < HEIGHT / 20; i++) {
                graphics.drawLine(x, y, 160, 160);
                y = y + 20;

            }

            for (int k = 0; k < WIDTH / 20; k++) {
                graphics.drawLine(x, 320, 160, 160);
                x = x - 20;

            }

            for (int i = 0; i < WIDTH / 20; i++) {
                graphics.drawLine(x, y, 160, 160);
                y = y - 20;

            }
        }


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
