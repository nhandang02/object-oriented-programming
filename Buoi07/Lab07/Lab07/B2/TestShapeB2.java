public class TestShapeB2
{
    public static void main(String[] args)
    {
        ShapeB2 s = new Circle(5.0, "blue", true);
        System.out.println(s);

        s = new RectangleB2(5.0, 2.0, s.getColor(), s.isFilled());
        System.out.println(s);

        s = new Square(3.0, "white", true);
        System.out.println(s);
        System.out.println();

        ShapeB2 s1 = new Circle(1.0, "red", false);
        System.out.println("cirlce s = circle s1 ? = " + s.equals(s1));

        ShapeB2 s2 = new Square(3.0, "white", true);
        System.out.println("square s = square s2 ? = " + s.equals(s2));
        System.out.println();

        ShapeB2[] shapes = new ShapeB2[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new RectangleB2(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new RectangleB2(12, 8, "Blue", true);

        //in ra cac dien tich cua array shapes trong class ShapeB2
        for(int i = 0; i < shapes.length; i++)
        {
            System.out.println("Area " + i + " = " + shapes[i].getArea());
        }

        //tim dien tich lon nhat trong array shapes cua class ShapeB2
        double maxArea = 0;
        for(int i = 0; i < shapes.length; i++)
        {
            double area = shapes[i].getArea();
            if(area > maxArea)
            {
                maxArea = area;
            }
        }

        System.out.println();
        System.out.println("The largest area in a array is = " + maxArea);
    }
}