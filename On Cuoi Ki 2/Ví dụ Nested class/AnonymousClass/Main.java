interface Age {
    void getAge();
}

public class Main {
    public static void main(String[] args) {
        Age Obj = new Age() {
            int x = 15;
            public  void getAge() {
                System.out.print("Age is: " + x);
            }
        };
        Obj.getAge();
    }
}