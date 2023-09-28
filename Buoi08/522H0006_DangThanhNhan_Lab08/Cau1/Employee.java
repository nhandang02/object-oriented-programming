public class Employee extends Person {
    private String id;
    private double salary;

    public Employee(String name, int birthyear, String id, double salary) {
        super(name, birthyear);
        setId(id);
        setSalary(salary);
    }

    public String getId() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee[name: " + this.name + "," + "birth year: " + this.birthyear + "," + "id: " + id + "," + "salary: " + salary + "]";
    }
}