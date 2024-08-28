public class RegularPolygon
{
    private String name;
    private int egdeAmount;
    private double egdeLength;

    public RegularPolygon()
    {
        this.name = "";
        this.egdeAmount = 3;
        this.egdeLength = 1;
    }

    public RegularPolygon(String name, int egdeAmount, double egdeLength)
    {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = egdeLength;
    }

    public RegularPolygon(String name, int egdeAmount)
    {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon)
    {
        this.name = polygon.name;
        this.egdeAmount = polygon.egdeAmount;
        this.egdeLength = polygon.egdeLength;
    }

    //get - set name
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    //get - set egde amount
    public int getEgdeAmount()
    {
        return this.egdeAmount;
    }
    public void setEgdeAmount(int egdeAmount)
    {
        this.egdeAmount = egdeAmount;
    }

    //get - set egde length
    public double getEgdeLength()
    {
        return this.egdeLength;
    }
    public void setEgdeLength(double egdeLength)
    {
        this.egdeLength = egdeLength;
    }

    public String getPolygon()
    {
        if(this.egdeAmount == 3)
            return "Triangle";
        else if(this.egdeAmount == 4)
            return "Quadrangle";
        else if(this.egdeAmount == 5)
            return "Pentagon";
        else if(this.egdeAmount == 6)
            return "Hexagon";
        return "Polygon has the numbers of egdes greater than 6";
    }

    public double getPerimeter()
    {
        return this.egdeLength * this.egdeAmount;
    }

    public double getArea()
    {
        if(this.egdeAmount == 3)
            return this.egdeLength * this.egdeLength * 0.433;
        else if(this.egdeAmount == 4)
            return this.egdeLength * this.egdeLength * 1;
        else if(egdeAmount == 5)
            return this.egdeLength * this.egdeLength * 1.72;
        else if(this.egdeAmount == 6)
            return this.egdeLength * this.egdeLength * 2.595;
        else
            return -1;
    }

    public String toString()
    {
        return this.name + " - " + this.getPolygon() + " - " + this.getArea();
    }
}