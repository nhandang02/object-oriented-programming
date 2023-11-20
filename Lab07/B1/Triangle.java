public class Triangle extends Shape
{
    private double base;
    private double height;

    public Triangle()
    {
        super();
        this.base = 0;
        this.height = 0;
    }

    public Triangle(double base, double height, String color)
    {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea()
    {
        return 1.0/2.0 * this.height * this.base;
    }

    public String toString()
    {
        return "Triangle[base = " + this.base + ", height = " + this.height + ", area = " + getArea() + ", color = " + getColor() + "]";
    }
}