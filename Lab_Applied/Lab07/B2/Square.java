public class Square extends RectangleB2
{
    public Square()
    {
        super();
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return getWidth();
    }

    public void setSide(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side)
    {
        setSide(side);
    }

    public void setLength(double side)
    {
        setSide(side);
    }

    public boolean equals(ShapeB2 s)
    {
        if(s instanceof Square)
        {
            Square sq = (Square) s;
            if(this.getArea() == sq.getArea())
            {
                return true;
            }
        }
        return false;
    }
}