import java.util.ArrayList;

public class TestStudent
{
    public ArrayList<Student> findStudent(ArrayList<Student> lstStu)
    {
        ArrayList<Student> result = new ArrayList<>();

        for(Student stu : lstStu)
        {
            String rank = stu.getRank();
            if(rank.equals("A") || rank.equals("Pass"))
            {
                result.add(stu);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        ArrayList<Student> lstStu = new ArrayList<Student>();

        lstStu.add(new ITStudent("Dang Thanh Nhan", 8.1, 5220080));
        lstStu.add(new ITStudent("Nguyen Thanh Nhan", 5.0, 5622000));
        lstStu.add(new MathStudent("Nguyen Van Bo", 6.1, "522H9912"));
        lstStu.add(new MathStudent("Bui Van Ngo", 4.1, "255S0001"));

        System.out.println("--- Students ---");
        for(Student stu : lstStu)
        {
            System.out.println(stu);
        }

        TestStudent find = new TestStudent();

        ArrayList<Student> result = find.findStudent(lstStu);

        System.out.println();
        System.out.println("Students who have A rank or Pass");
        for(Student stu : result)
        {
            System.out.println(stu);
        }
    }
}
