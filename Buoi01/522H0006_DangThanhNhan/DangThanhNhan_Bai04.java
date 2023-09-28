import java.util.Scanner;
public class DangThanhNhan_Bai04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hay nhap do F can doi sang do C: ");
		double doF = sc.nextDouble();
		System.out.println("Hay nhap do C can doi sang do F: ");
		double doC = sc.nextDouble();
		
		System.out.println("Do F can doi sang do C = " + ConvC(doF));
		System.out.println("Do C can doi sang do F = " + ConvF(doC));
	}
	public static double ConvC(double doF) {
		double C = 5.0/9 * (doF-32);
		return C;
	}
	public static double ConvF(double doC) {
		double F = 9.0/5 * doC + 32;
		return F;
	}
}


