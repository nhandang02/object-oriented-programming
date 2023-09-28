import java.util.ArrayList;

public class PointModel <T> {
    private ArrayList<T> al = new ArrayList<T>();
    public void add(T obj) {
        al.add(obj);
    }
    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public void isInside()
    {
        for(T obj : al)
        {
            if(((Point) obj).getDistance() <= 1.0)
            {
                System.out.println(obj + " - is inside");
            }
            else
            {
                System.out.println(obj + " - is not inside");
            }
        }
    }

    public static void main(String[] args) {
        PointModel<Point> point = new PointModel<Point>();
        point.add(new Point(1.0, 2.0));
        point.add(new Point(0.5, 0.25));
        point.add(new Point(5.0, 2.0));
        point.display();
        System.out.println();
        point.isInside();
    }
}