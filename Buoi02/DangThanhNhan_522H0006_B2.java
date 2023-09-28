import java.util.Scanner;

public class DangThanhNhan_522H006_B2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap vao so phan tu mang: ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		nhap(arr,sc);
		int thoat = 0;
		do{
			menu();
			System.out.print("Nhap vao su lua chon cua thay: ");
			int n = sc.nextInt();
			switch(n){
				case 0:
					thoat = 1;
					break;
				case 1:
					System.out.println("Gia tri lon nhat trong mang: " + findMax(arr));
					break;
				case 2:
					System.out.println("Gia tri nho nhat trong mang: " + findMin(arr));
					break;	
				case 3:	
					System.out.println("Sum even of array: " + sumEven(arr));
					break;
				case 4:
					System.out.println("So hoan hao trong mang: " + countPerfect(arr));
					break;
				case 5:
					System.out.println("So nguyen to trong mang: " + countArray(arr));
					break;
				case 6:
					System.out.print("Nhap vao phan tu can tim: ");
					int k = sc.nextInt();
					System.out.println("So can tim o vi tri: " + find(arr,k));
					break;	
				case 7:
					int[] M = new int [arr.length];
					bd(arr, M);
					for(int i = 0; i < M.length; i++){
						System.out.println("A[" + i + "] = " + M[i]);
					}
				case 9:
					System.out.print("Nhap vao so k: ");
					int x = sc.nextInt();
					int[] b = new int[countArray2(arr, x)];
					ktra(arr, x, b);
					for(int i = 0; i < b.length; i++){
						System.out.println("phan tu chia het cho k: A[" + i + "] = " + b[i]);
					}
				case 10:
					findMax3(arr);
					System.out.println("So lon thu 3 trong mang: " + arr[2]);
			}	
		}while(thoat == 0);
	}

	public static void menu(){
		System.out.println("Cau1: Tim max trong array: ");
		System.out.println("Cau2: Tim min trong array: ");
		System.out.println("Cau3: Tinh sum cac so chan trong array: ");
		System.out.println("Cau4: Dem so hoan hao trong array: ");
		System.out.println("Cau5: Dem so nguyen to trong array: ");
		System.out.println("Cau6: Tim vi tri cua so k: ");
		System.out.println("Cau7: tra ve mang binh phuong: ");
		System.out.println("Cau8: : ");
		System.out.println("Cau9: Tim tat ca so chia het cho k trong mang: ");
		System.out.println("Cau10: tim so lon thu ba trong mang: ");
	}
	public static void nhap(int[] arr, Scanner sc){
		for(int i = 0; i < arr.length; i++){
			System.out.print("A[" + i + "]" + " = ");
			arr[i] = sc.nextInt();
		}
	}
	public static int findMax(int[] arr){
		int max = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static int findMin(int[] arr){
		int min = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(min > arr[i])
				min = arr[i];
		}
		return min;
	}

	public static int sumEven(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0)
				sum += arr[i];
		}
		return sum;
	}

	public static int CheckPerfect(int a){
		int sum = 0;
		for(int i = 1; i <= a/2; i++){
			if(a % i == 0){
				sum += i;
			}
		}
		if(sum == a)
			return 1;
		return 0;	
	}
	public static int countPerfect(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(CheckPerfect(arr[i]) == 1)
				count++;
		}
		return count;
	}
	
	public static int check(int n){
		if(n < 2){
			return 0;
		}else if(n > 2){
			if(n % 2 == 0){
				return 0;
			}	
			for(int i = 3; i < n/2; i++){
					if(n % i == 0)
						return 0;
			}
		}
		return 1;		
	}
	
	
	public static int countArray(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(check(arr[i]) == 1){
				count++;
			}	
		}
		return count;	
	}
	
	public static int find(int[] arr, int k){
		int i;
		for(i = 0; i < arr.length; i++){
			if(arr[i] == k)
				return i;
		}
		return -1;
	}

	public static void bd(int[] arr, int[] M){
		for(int i = 0; i < arr.length; i++){
			M[i] = (int)Math.pow(arr[i], 2);
		}
	}
	
	public static void ktra(int[] arr, int x, int[] b){
		int j = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % x == 0){
				b[j] = arr[i];
				j++;
			}	
		}
	}
	
	public static int countArray2(int[] arr, int x){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % x == 0)
				count++;
		}
		return count;
	}

	public static void findMax3(int[] arr){
		int tem = arr[0];
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] < arr[j]){
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}	
			}
		}
	}	
}