public class MoveableCircle implements Moveable
{
    int radius;
    MoveablePoint center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString()
    {
        return "MoveableCircle[radius = " + this.radius + ", center = " + this.center + "]";
    }

    public void moveUp()
    {
        center.moveUp();
    }

    public void moveDown()
    {
        center.moveDown();
    }

    public void moveLeft()
    {
        center.moveLeft();
    }

    public void moveRight()
    {
        center.moveRight();
    }
}