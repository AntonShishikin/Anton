package gui;

import Shapes.Shape;
import javax.swing.*;
import java.awt.*;

public class ShapesPanel extends JPanel {
    private Shape[] shapes;

    public ShapesPanel(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
