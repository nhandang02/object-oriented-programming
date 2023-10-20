import java.util.Scanner;
public class DangThanhNhan_Bai012 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hay nhap mot so: ");
		int n = sc.nextInt();
		
		System.out.printf("So sau khi dao nguoc la: " + Rev(n));
	}
	public static int Rev(int n) {
		int S=0;
		while(n!=0) {
			S = S*10 + n%10;
			n/=10;
		}
		return S;	
	}
}