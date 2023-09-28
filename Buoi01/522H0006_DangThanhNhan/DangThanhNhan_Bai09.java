import java.util.Scanner;
public class DangThanhNhan_Bai09 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hay nhap so n: ");
		int n = sc.nextInt();
		
		System.out.print("HailStone numbers: ");
		HailStone(n);
	}
	public static void HailStone(int n) {
		while(n>1) {
			if(n%2!=0) n = 3*n+1;
			else n/=2;
		    System.out.print(n + " ");
		}
	}
}
