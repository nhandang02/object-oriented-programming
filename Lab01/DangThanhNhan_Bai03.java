import java.util.Scanner;
public class DangThanhNhan_Bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap so a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so b: ");
		int b = sc.nextInt();
		System.out.println("So du cua a chia b la: " + Du(a, b));
	}
	public static int Du(int a, int b) {
		int du = a%b;
		return du; 
	}
}
