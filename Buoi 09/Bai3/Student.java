public class Student
{
    private String sName;
    private String sId;
    private double gpa;

    public Student()
    {
        this("", "", 0.0);
    }

    public Student(String sName, String sId,  double gpa)
    {
        this.sName = sName;
        this.sId = sId;
        this.gpa = gpa;
    }

    public String getName() {
        return this.sName;
    }
    public void setName(String Name) {
        this.sName= Name;
    }

    public String getId() {
        return this.sId;
    }
    public void setId(String Id) {
        this.sId = Id;
    } 

    public double getGpa() {
        return this.gpa;
    }
    public void setGpa(double Gpa) {
        this.gpa = Gpa;
    }

    public String toString() {
        return "Student[Name: " + sName + ", " + "Id: " + sId + ", " + "gpa: " + gpa + "]";
    }
}