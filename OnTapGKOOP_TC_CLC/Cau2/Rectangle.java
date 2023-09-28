import javax.swing.text.html.HTMLDocument.RunElement;

public class Rectangle
{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len)
    {
        //sinh vien code tai day
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        return this.name;
    }

    public String getColor()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        return this.color;
    }

    public double getWidth()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        return this.width;
    }
    public double getLength()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        return this.length;
    }

    public void setName(String name)
    {
        //sinh vien code tai day
        this.name = name;
    }

    public void setColor(String color)
    {
        //sinh vien code tai day
        this.color = color;
    }

    public void setWidth(double width)
    {
        //sinh vien code tai day
        this.width = width;
    }

    public void setLength(double length)
    {
        //sinh vien code tai day
        this.length = length;
    }

    public double getPerimeter()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        return 2 * (this.width + this.length);
    }

    public String getType()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        double area = this.width * this.length;
        if(area >= 10)
            return "A";
        else if(area >= 5 && area < 10)
            return "B";
        return "C";
    }
	
	public boolean isSquare()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        if(this.width == this.length)
            return true;
        return false;
    }

    public double calDiagonalLine()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        return Math.sqrt((this.width * this.width) + (this.length * this.length));
    }

    public Rectangle resize(double rate)
    {
        //sinh vien viet code tai day va sua lai gia tri return
        double widthNew = this.width * rate;
        double lengthNew = this.length * rate;
        return new Rectangle(name, color, widthNew, lengthNew);
    }

    public String toString()
    {
        //sinh vien viet code tai day va sua lai gia tri return
        return "Rectangle[" + this.name + ", " + this.width + ", " + this.length + ", " + this.width * this.length + ", " + this.getType() + "]";
    }
}