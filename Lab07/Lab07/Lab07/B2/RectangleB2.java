public class RectangleB2 extends ShapeB2
{
    protected double width;
    protected double length;

    public RectangleB2()
    {
        super();
        this.width = 0;
        this.length = 0;
    }

    public RectangleB2(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getArea()
    {
        return this.width * this.length;
    }

    public double getPerimeter()
    {
        return 2 * (this.width + this.length);
    }

    public boolean equals(ShapeB2 s)
    {
        if(s instanceof RectangleB2)
        {
            RectangleB2 r = (RectangleB2) s;
            if(this.getArea() == r.getArea())
            {
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        return "Rectangle[width = " + this.width + ", length = " + this.length + ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", color = " + getColor() + ", filled = " + isFilled() + "]";
    }
}