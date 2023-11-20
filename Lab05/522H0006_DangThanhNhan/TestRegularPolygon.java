public class TestRegularPolygon
{
    public static void main(String[] args)
    {
        RegularPolygon re1 = new RegularPolygon();
        RegularPolygon re2 = new RegularPolygon("Dang", 4, 5);
        RegularPolygon re3 = new RegularPolygon("Thanh", 8);
        RegularPolygon re4 = new RegularPolygon(new RegularPolygon("Nhan", 6, 5));

        System.out.println(re1);
        System.out.println(re2);
        System.out.println(re3);
        System.out.println(re4);
    }
}