public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		setProgram(program);
		setYear(year);
		setFee(fee);
	}
	
	public String getProgram() {
		return this.program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getFee() {
		return this.fee;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString() {
		return "Student{" + this.name + "/" + this.address + "/" + 
				this.program + "/" + this.year + "/" + this.fee + "}";
	}
}