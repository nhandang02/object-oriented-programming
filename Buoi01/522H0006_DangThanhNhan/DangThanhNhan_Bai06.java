import java.util.Scanner;
public class DangThanhNhan_Bai06 {
	public static void main(String[] args) {
		int []a = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.printf("Nhap phan tu thu %d: ", i+1);
			a[i] = sc.nextInt();
		}
		
		System.out.println("So nho nhat trong 3 so la: " + Min(a));
	}
	public static int Min(int a[]) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] < min)	min = a[i];
		}
		return min; 
	}
}
