import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int y = 20;
        graphics.setColor(Color.RED);
        for (int i = 0; i < WIDTH / 20; i++) {
            graphics.drawLine(0, y, y, HEIGHT);
            y = y + 20;
        }
        int x = 320;
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < WIDTH / 20; i++) {
            graphics.drawLine(x, 0, WIDTH, x);
            x = x - 20;
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

