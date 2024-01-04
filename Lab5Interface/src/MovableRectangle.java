public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        // Проверка, чтобы убедиться, что обе точки имеют одинаковую скорость
        if (xSpeed != ySpeed) {
            throw new IllegalArgumentException("Speeds must be consistent for both points");
        }

        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public String toString() {
        return "Rectangle with top left: " + topLeft.toString() + " and bottom right: " + bottomRight.toString();
    }
}
