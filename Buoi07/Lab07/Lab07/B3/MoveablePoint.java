public class MoveablePoint implements Moveable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "MoveablPoint[x = " + this.x + ", y = " + this.y + ", x speed = " + this.xSpeed + ", y speed = " + this.ySpeed + "]";
    }

    public void moveUp()
    {
        this.y = this.y - this.xSpeed;
    }

    public void moveDown()
    {
        this.y = this.y + this.xSpeed;
    }

    public void moveLeft()
    {
        this.x = this.x - this.ySpeed;
    }

    public void moveRight()
    {
        this.x = this.x + this.ySpeed;
    }
}