package gui;

import Shapes.*;
import Shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Shape[] shapes = generateRandomShapes(20);
        frame.add(new ShapesPanel(shapes));

        frame.setVisible(true);
    }

    private static Shape[] generateRandomShapes(int n) {
        Shape[] shapes = new Shape[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            Point randomPosition = new Point(rand.nextInt(750), rand.nextInt(550));

            if (rand.nextBoolean()) {
                int radius = rand.nextInt(50) + 10;
                shapes[i] = new Circle(randomColor, randomPosition, radius);
            } else {
                int width = rand.nextInt(100) + 10;
                int height = rand.nextInt(100) + 10;
                shapes[i] = new RectangleShape(randomColor, randomPosition, width, height);
            }
        }

        return shapes;
    }
}
