public class TestB4
{
    public static void main(String[] args)
    {
        GeometricObject g = new CircleB4(2.0);
        System.out.println(g.getArea() + ", " + g.getPerimeter());

        Resizeable r = new ResizeableCirlce(10.0);
        r.resize(50);
    }
}