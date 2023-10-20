public class Circle extends ShapeB2
{
    private double radius;

    public Circle()
    {
        super();
        this.radius = 0;
    }

    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    public boolean equals(ShapeB2 s)
    {
        if(s instanceof Circle)
        {
            Circle c = (Circle) s;
            if(this.radius == c.getRadius() && this.getArea() == c.getArea())
            {
                return true;
            }
        }
        return false;
    }

    public String toString()
    {
        return "Circle[radius = " + this.radius + ", area = " + getArea() + ", perimeter = " + getPerimeter() + ", color = " + getColor() + ", filled = " + isFilled() + "]";
    }
}