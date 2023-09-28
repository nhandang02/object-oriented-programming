public class TestShape
{
    public static void main(String[] args)
    {
        Shape s1 = new Rectangle(2.0, 5.0, "blue");
        System.out.println(s1);

        s1 = new Triangle(2.0, 10.0, "pink");        
        System.out.println(s1);
    }
}
