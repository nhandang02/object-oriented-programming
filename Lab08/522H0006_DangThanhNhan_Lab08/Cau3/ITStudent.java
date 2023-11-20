public class ITStudent extends Student
{
    private int sID;

    public ITStudent()
    {
        super();
        this.sID = 0;
    }

    public ITStudent(String sName, double gpa, int sID)
    {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getRank()
    {
        if(this.gpa > 8.0 && this.gpa <= 10.0)
            return "A";
        else if(this.gpa > 5.0 && this.gpa <= 8.0)
            return "B";
        return "C";
    }

    public String toString()
    {
        return "ITStudent[name = " + this.sName + ", ID = " + this.sID + ", GPA = " + this.gpa + "]";
    }
}