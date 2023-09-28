import java.util.Scanner;
public class DangThanhNhan_Bai010 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hay nhap mot so: ");
		int n = sc.nextInt();
		
		System.out.println("Tong cua so dau va so cuoi la: " + Sum(n));
	}
	public static int Sum(int n) {
		int S=0;
		int a = n;
		int sodau=0;
		int socuoi = n%10;
		while(a!=0) {
			sodau = a%10;
			a/=10;
		}
		S = sodau + socuoi;
		
		return S;
	}
}
