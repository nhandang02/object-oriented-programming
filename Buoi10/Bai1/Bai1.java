class Student {
    private String name;
    private String address;
    private String sex;
    private double score;

    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    public class StudentOperater {
        public String print() {
            return "Student[" + name + ", " +address + ", " + sex + ", " + score + " ]";
        }

        public String type() {
            if (score < 5) return "C";
            else if (score <= 8) return "B";
            else return "A";
        }
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student st1 = new Student("Nhan", "123456", "Male", 4.9 );
        Student st2 = new Student("Hao", "654321", "Male", 9.8 );

        Student.StudentOperater sto1 = st1.new StudentOperater();
        Student.StudentOperater sto2 = st2.new StudentOperater();

        System.out.println(sto1.print() + " Type " + sto1.type());
        System.out.println(sto2.print() + " Type " + sto2.type());
    }
}