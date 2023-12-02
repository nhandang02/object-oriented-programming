public abstract class ShapeB2
{
    protected String color;
    protected boolean filled;

    public ShapeB2()
    {
        this.color = "";
        this.filled = true;
    }

    public ShapeB2(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    public boolean equals(ShapeB2 s)
    {
        if(s instanceof ShapeB2)
        {
            ShapeB2 temp = (ShapeB2) s;
            if(this.getColor() == temp.getColor() && this.isFilled() == temp.isFilled())
            {
                return true;
            }
        }
        return false;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString()
    {
        return "Shape[color = " + this.color + ", filled = " + this.filled + "]";
    }
}