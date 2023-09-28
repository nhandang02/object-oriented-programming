public class ResizeableCirlce extends CircleB4 implements Resizeable
{
    public ResizeableCirlce()
    {
        super();
    }

    public ResizeableCirlce(double radius)
    {
        super(radius);
    }
    
    public void resize(int percent)
    {
        this.radius = this.radius * (percent / 100.0);
    }
}