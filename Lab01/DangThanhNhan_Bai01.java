import java.util.Scanner;
public class DangThanhNhan_Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		
 		System.out.println("Hay nhap student id cua ban: ");
		String id = sc.nextLine();
		System.out.println("Hay nhap ho va ten cua ban: ");
		String name = sc.nextLine();
		System.out.println("Hay nhap ngay tahang nm sinh cua ban: "); 
		int dob = sc.nextInt();

		System.out.println("Student id: " + id);
		System.out.println("Name: " + name); 
		System.out.println("Date of birth: " + dob);
	}
}
