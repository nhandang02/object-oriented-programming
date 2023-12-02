public class CircleB4 implements GeometricObject
{
    protected double radius;

    public CircleB4()
    {
        this.radius = 1.0;
    }

    public CircleB4(double radius)
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
}