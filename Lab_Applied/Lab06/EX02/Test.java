public class Test {
	public static void main(String[] args) {
		Person p1 = new Person("Nhan", "15");
		System.out.println(p1);
		
		Staff s1 = new Staff("Nhan", "15","Trung Phu", 1500000);
		System.out.println(s1);
		
		Student st1 = new Student("Nhan", "15", "Concho", 2, 1500000);
		System.out.println(st1);
	}
}