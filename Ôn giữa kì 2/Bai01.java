import java.util.*;
public class Bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap kich thuoc cua mang: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhap a[" + i + "]");
			a[i] = sc.nextInt();
		}
				
		System.out.println("Phan tu chan lon nhat trong mang la: " + maxEven(a));
		System.out.println("Phan tu le nho nhat trong mang la: " + minOdd(a));
		System.out.println("Tong phan tu le nho nhat mang va phan tu chan lon nhat mang la: " + sumMEMO(a));
		System.out.println("Tong casc phan tu chan trong mang la:" + sumEven(a));
		System.out.println("Tich cac so le trong mang la: " + proOdd(a));
		System.out.println("Vi tri so chan dau tien la: " + idxFirstEven(a));
		System.out.println("Vi tri so le cuoi cung la: " + idxLastOdd(a));
		 
		System.out.println("New Array = " + Arrays.toString(input(n)));
	}
	
	public static int maxEven(int[] a) {
		int max = a[0];
		int poss = -1;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0 && a[i] > max)	max = a[i];
		}
		return max;
	}
	
	public static int minOdd(int[] a) {
		int min = a[0];
		int poss = -1;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 != 0 && a[i] <= min)	min = a[i];
		}
		return min;
	}
	
	public static int sumMEMO(int[] a) {
		return maxEven(a) + minOdd(a); 
	}
	
	/*public static int sumEven(int[] a) {
		int S=0;
		for(int x:a) {
			if(x % 2 == 0)	S+=x;
		}
		return S;
	}*/
	
	public static int sumEven(int[] a) {
		int S=0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0)	S+=a[i];
		}
		return S;
	}
	
	public static int proOdd(int[] a) {
		int P=1;
		for(int x:a) {
			if(x % 2 != 0)	P*=x;
		}
		return P;
	}
	
	public static int idxFirstEven(int[] a) {
		int poss = -1;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0) {
				poss = i;
				break;
			}
		}
		return poss;
	}
	
	public static int idxLastOdd(int[] a) {
		int poss = -1;
		for(int i=a.length-1; i>=0; i--) {
			if(a[i] % 2 != 0) {
				poss = i;
				break;
			}
		}
		return poss;
	}
	
	public static int[] input(int n) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Nhap a[" + i + "]");
			arr[i] = sc.nextInt();
		}
		return arr;	
	}
}