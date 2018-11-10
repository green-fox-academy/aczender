import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 280;
        int length = 10;

        for (int j = 1; j < 10; j++) {          // this for loop adds another row to the top of
            // the other
            for (int i = 1; i < length; i++) {  //this for loop creates a row of triangles
                triangleBase(x, y, graphics);
                x += 20;
            }
            x = j * 10;
            y = y - 20;
            length = length - 1;
        }
    }

    public static void triangleBase(int x, int y, Graphics graphics) {
        int[] a = new int[]{x, x + 20, x + 10};
        int[] b = new int[]{y, y, y - 20};

        graphics.drawPolygon(a, b, 3);
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

