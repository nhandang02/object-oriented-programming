public class TestMoveable
{
    public static void main(String[] args)
    {
        Moveable m = new MoveablePoint(1, 3, 5, 3);
        System.out.println(m);

        m = new MoveableCircle(1, 3, 5, 3, 5);
        System.out.println(m);
    }
}