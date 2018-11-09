import com.sun.scenario.effect.Offset;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            draw(0, 0, WIDTH, graphics);

        }

    }

    public static void draw(int x, int y, int width, Graphics graphics){
        int count = 20;

        for (int i = 0; i < 16; i++) {
            graphics.drawLine(x, i*count + y, i*count + y, width/2+ y);

            graphics.drawLine((x-i*count + width/2), y, width/2+x, (x-i*count + width/2));

        }
    }


    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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
