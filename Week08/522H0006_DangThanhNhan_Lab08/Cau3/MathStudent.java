public class MathStudent extends Student
{
    private String sID;

    public MathStudent()
    {
        super();
        this.sID = "0";
    }

    public MathStudent(String sName, double gpa, String sID)
    {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getRank()
    {
        if(this.gpa >= 5.0)
            return "Pass";
        return "Fail";
    }

    public String toString()
    {
        return "MathStudent[name = " + this.sName + ", ID = " + this.sID + ", GPA = " + this.gpa + "]";
    }
}
