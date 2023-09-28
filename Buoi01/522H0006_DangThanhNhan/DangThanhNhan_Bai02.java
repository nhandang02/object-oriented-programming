import java.util.Scanner;
public class DangThanhNhan_Bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter base: ");
		int base = sc.nextInt();
		System.out.println("Enter height: ");
		int height = sc.nextInt();
		double Area;

		Area = 1.0/2 * base * height;

		System.out.println("Area: " + Area);
	}
}
