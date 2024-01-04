import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawingPanel extends JPanel {
    private MovableCircle circle;
    private MovableRectangle rectangle;
    private Timer timer;

    public DrawingPanel() {
        circle = new MovableCircle(400, 300, 5, 5, 50);
        rectangle = new MovableRectangle(200, 200, 400, 400, 10, 10);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                circle.moveRight();
                rectangle.moveDown();
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(circle.center.x - circle.radius, circle.center.y - circle.radius, circle.radius * 2, circle.radius * 2);

        g.fillRect(rectangle.topLeft.x, rectangle.topLeft.y,
                rectangle.bottomRight.x - rectangle.topLeft.x,
                rectangle.bottomRight.y - rectangle.topLeft.y);
    }
}
