public class MainLocal {
    static int x = 15;
    int y = 2;
    private int z = 152;

    public void print() {
        int t = 1;
        class LocalClass {
            public void print() {
            System.out.println("x + t = " + (x + t));
            System.out.println("y + t = " + (y + t));
            System.out.println("z + t = " + (z + t));
            }
        }
        LocalClass localObj = new LocalClass();
        localObj.print();
    }
}