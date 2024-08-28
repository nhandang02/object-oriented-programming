import java.util.Scanner;
public class DangThanhNhan_Bai07 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hay nhap mot chuoi: ");
		String a = sc.nextLine();
		char b = a.charAt(0);	
		
		if(Kiemtra(b)==1) 	System.out.println(b + " la chu");
		else	System.out.println(b + " khong la chu");
	}
	public static int Kiemtra(char b) {
		if((b>='a' && b<='z') || (b>='A'&& b<='Z')) return 1;
		else return 0; 
	}
}


