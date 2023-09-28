import java.util.Scanner;
public class DangThanhNhan_Bai05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hay nhap nam can kiem tra: ");
		int nam = sc.nextInt();
		
		if(Check(nam)==1)	System.out.println("Nam nay la nam nhuan");	
		else	System.out.println("Nam nay khong la nam nhuan"); 
	}
	public static int Check(int nam) {
		if (nam % 400==0) return 1;
		else return 0; 
	}
}
