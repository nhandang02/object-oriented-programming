import java.util.ArrayList;

public class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();
    public void add(T obj) {
        al.add(obj);
    }
    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        PersonModel<Student> stu = new PersonModel<Student>();
        stu.add(new Student("Dang Thanh Nhan", 2004, "522H0006", 8.0));
        stu.add(new Student("Nguyen Thanh Nhan", 2004, "522H0051", 10.0));
        stu.display();
        System.out.println();

        PersonModel<Employee> emp = new PersonModel<Employee>();
        emp.add(new Employee("Dang Thanh Nhan", 2004, "522H0006", 15000000));
        emp.add(new Employee("Nguyen Thanh Nhan", 2004, "522H0051", 100000000));
        emp.display();
        System.out.println();

        PersonModel<Person> per = new PersonModel<Person>();
        per.add(new Person("Dang Thanh Nhan", 2004));
        per.add(new Person("Nguyen Thanh Nhan", 2004));
        per.display();
        System.out.println();
    }


}