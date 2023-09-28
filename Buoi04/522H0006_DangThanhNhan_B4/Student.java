public class Student {
	public static void main(String [] args) {
		Student st1 = new Student(52200006, "Nhan", "Dang");
		Student st2 = new Student(52200090, "Hao", "Vo");
		
		System.out.println("Fullname Sutdent1= " + st1.getName());
		System.out.println("Fullname Student2= " + st2.getName());
		System.out.println(st1);
		System.out.println(st2);
		
		st1.setFirstName("Thanh");
		st1.setLastName("Nhan");
		st2.setFirstName("Nhat");
		st2.setLastName("Hao");

		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println("Fullname Sutdent1= " + st1.getName());
		System.out.println("Fullname Student2= " + st2.getName());
	
	}
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return this.id = id;
	}
	
	public String getFirstName() {
		return this.firstName = firstName;
	} 
	
	public String getLastName() {
		return this.lastName = lastName;
	} 
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	public String toString() {
		return "Student[id= " + id + "," + "firstName= " + firstName + "," + "lastName= " + lastName + "]";
	}
}