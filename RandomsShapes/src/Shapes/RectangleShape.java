package Shapes;

import java.awt.*;

public class RectangleShape extends Shape {
    private int width, height;

    public RectangleShape(Color color, Point position, int width, int height) {
        super(color, position);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(position.x, position.y, width, height);
    }
}
