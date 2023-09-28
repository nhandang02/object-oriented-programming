import java.util.Scanner;
public class DangThanhNhan_Bai08 {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);

        	System.out.println("Hay nhap so n: ");
		int n = sc.nextInt();
	
		System.out.println("CauA = " + cauA(n));
		System.out.println("CauB = " + cauB(n));	
		System.out.println("CauC = " + cauC(n));	
		System.out.println("CauD = " + cauD(n));	
		System.out.println("CauE = " + cauE(n));			
	}
	public static int cauA(int n) {
		int S=0;
		for(int i=1; i<=n; i++) {
			S+=i;
		}
		return S;
	}
	public static int cauB(int n) {
		int P=1;
		for(int i=1; i<=n; i++) {
			P*=i;
		}
		return P;
	}
	public static int cauC(int n) {
		int S=0;
		for(int i=0; i<=n; i++) {
			S+=Math.pow(2, i);
		}
		return S;
	}
	public static float cauD(int n) {
		float S=0;
		for(int i=1; i<=n; i++) {
			S+=1.0/(2*i);
		}
		return S;
	}
	public static int cauE(int n) {
		int S=0;
		for(int i=1; i<=n; i++) {
			S+=i*i;
		}
		return S;	
	}
}




