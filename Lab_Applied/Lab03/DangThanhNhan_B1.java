 import java.util.Scanner;
public class DangThanhNhan_B1 {
	public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
		}
	}
	
	public static void Remove(int arr[], int n) {
        	for (int i = n; i < arr.length - 1; i++) {
            		arr[i] = arr[i + 1];
       		 }
    	}
	
    	public static int checkDel(int arr[], int k) {
        	int a = 0;
        	for (int i = 0; i < arr.length; i++) {
            		if (arr[i] == k) {
                		Remove(arr, i);
                		a = 1;
                		break;
            		}
        	}
        	return a;
   	}
	public static int[] removeDuplicate(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        
        return result;
    	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
        	System.out.print("Nhap so phan tu cua mang: ");
       	int n = sc.nextInt();
        	int[] arr = new int[n];
        	System.out.print("Nhap cac phan tu cua mang: \n");
        	for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();
        	}
        	System.out.print("Cac phan tu cua mang: ");
       	show(arr);

		//Remove The First
		
		System.out.println("\nNhap vao so can xoa: ");
		int k = sc.nextInt();
		if (checkDel(arr, k) == 1)	System.out.println("True");
   		else	System.out.println("False");

		//Insert An Element

        	System.out.print("Nhap so muon chen: ");
        	int element = sc.nextInt();
        	System.out.print("Nhap vi tri: ");
        	int position = sc.nextInt();

        	for (int i = arr.length - 1; i > position-1 ; i--) {
            	arr[i] = arr[i - 1];
        	}
        	arr[position-1] = element;
		System.out.print("Cac phan tu cua mang: ");
		show(arr);

		//Find The Duplicate

		System.out.print("\nGia tri trung: [");
        	for (int i = 0; i < arr.length; i++) {
            	for (int j = 0; j < i; j++) {
                		if (arr[i] == arr[j]) 
                    System.out.print("" + arr[i]);
            	}
        	}
        	System.out.print("] ");
		show(arr);

		//Remove The Duplicate
		
		System.out.print("\nXoa phan tu trung lap: ");
		show(removeDuplicate(arr));
        	sc.close();
	}
}