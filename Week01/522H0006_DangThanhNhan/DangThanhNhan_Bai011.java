import java.util.Scanner;
public class DangThanhNhan_Bai011 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hay nhap mot so: ");
		int n = sc.nextInt();
		
		System.out.printf("%d co %d chu so: ", n, Dem(n));
	}
	public static int Dem(int n) {
		int count=0;
		int a = n;
		int sodau;
		while(a!=0) {
			sodau = a%10;
			a/=10;
			count++;
		}		
		return count;
	}
}