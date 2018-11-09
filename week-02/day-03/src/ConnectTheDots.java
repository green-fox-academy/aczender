import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] box = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] polygon = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        dotsFunct(polygon, graphics);
        dotsBox(box, graphics);
    }

    public static void dotsFunct(int[][] polygon, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int xpoints[] = new int[polygon.length];
        int ypoints[] = new int[polygon.length];

        for (int i = 0; i < polygon.length; i++) {
            xpoints[i] = polygon[i][0];
            ypoints[i] = polygon[i][1];
        }

        int npoints = polygon.length;

        graphics.drawPolygon(xpoints, ypoints, npoints);
    }

    public static void dotsBox(int[][] box, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        int zpoints[] = new int[box.length];
        int vpoints[] = new int[box.length];

        for (int i = 0; i < box.length; i++) {
            zpoints[i] = box[i][0];
            vpoints[i] = box[i][1];
        }

        int npoints = box.length;

        graphics.drawPolygon(zpoints, vpoints, npoints);
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
