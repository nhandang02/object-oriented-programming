import java.util.Scanner;
public class DangThanhNhan_Bai013 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		if(Pal(n)==n) System.out.printf(n + " is palindrome number");
 		else	System.out.printf(n + " is not palindrome number");
	}
	public static int Pal(int n) {
		int S=0;
		while(n!=0) {
			S = S*10 + n%10;
			n/=10;
		}
		return S;	
	}
}