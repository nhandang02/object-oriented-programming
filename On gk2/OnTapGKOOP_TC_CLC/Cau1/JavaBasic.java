import java.util.*;
public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        //sinh vien code tai day
        int S=0;
        for(int x:a) {
        	if(x<0)	S+=x;
        }
        return S;
    }

    public static String uppercaseFirstVowels(String str){
        //sinh vien code tai day
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
        	char c = word.charAt(0);
        	if(c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i') {
        		c = Character.toUpperCase(c);
        	}
        	result = result.append(c + word.substring(1) + " ");
        }
        return result.toString();
    }
	
	public static int findMinNegativeElement(int a[]){
        //sinh vien code tai day
        int poss = -1;
        for(int i=0; i<a.length; i++) {
        	if(a[i] < 0) {
         		poss = i;
        		break;
        	}
        }
        if(poss == -1) return -1;
        for(int i=0; i<a.length; i++) {
        	if(a[i] < 0 || a[i] < a[poss]) {
        		poss = i;
        	}
        }
        return poss;
    }
	
	public static String getName(String str){
        //sinh vien code tai day
        /*str = str.replaceAll("Ho ten:", "");*/
        str = str.substring(7);
        return str.toString();
    }

    public static int findFirstMod3Element(int[] a){
        //sinh vien code tai daye
        for(int i=0; i<a.length; i++) {
        	if(a[i] % 3 == 0) return i;
        }
        return -1;
    }

    public static int countString(String str, String k){
        //sinh vien code tai day
        int count = 0;
        int index = 0;
        str = str.toLowerCase();
        k = k.toLowerCase();
        while(true) {
        	index = str.indexOf(k, index);
        	if(index != -1) {
        		count++;
        		index += k.length();
        	}
        	else	break;
        }
        return count;
    }

    public static void main(String[] args){
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Nhap kich thuoc mang: ");
    	   int n = sc.nextInt();
    	   
    	   int[] a = new int[n];
    	   for(int i=0; i<n; i++) {
    	   	System.out.println("Nhap a[" + i + "] : ");
    	   	a[i] = sc.nextInt();
    	   }
    	   
    	   System.out.print("a[] = [ ");
    	   for(int x : a) {
    	   	System.out.print(x + " ");
    	   }
    	   System.out.print("]");
    	   System.out.println();
    	   
        /*int[] a = {1,-2,3,4,-2,1,-9};*/
        //sinh vien code tai day
        System.out.println("Tong so phan tu am trong mang la: " + sumNegativeElements(a));
        
        
        String s = "nguyen thi uyen an";
        System.out.println("Chuoi sau khi in hoa cac nguyen am dau tu la: " + uppercaseFirstVowels(s));
        
        
        System.out.println("Vi tri phan tu am nho nhat mang la: " + findMinNegativeElement(a));
        
        
        //sinh vien code tai day
		String s1 = "Ho ten: Nguyen Thi Anh Dao";
		System.out.println("Ho va ten sau khi tach la: " + getName(s1));
		
		
		//sinh vien code tai day
		System.out.println("Vi tri phan tu nho nhat chia het cho 3 la: " + findFirstMod3Element(a));
		
		
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
        String k = "Phuong";
        System.out.println("Tu: " + k + " xuat hien " + countString(s2, k) + " lan trong chuoi: " + s2);
		//sinh vien code tai day
    }

}