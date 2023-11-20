public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        //sinh vien code tai day
        int S = 0;
        for(int x:a) {
        	if(x<0)	S+=x;
        }
    }
    
    /*public static String uppercaseFirstVowels(String str){
        //sinh vien code tai day
    }
	
	public static int findMinNegativeElement(int a[]){
        //sinh vien code tai day
    }
	
	public static String getName(String str){
        //sinh vien code tai day
    }

    public static int findFirstMod3Element(int[] a){
        //sinh vien code tai daye
    }

    public static int countString(String str, String k){
        //sinh vien code tai day
    }*/

    public static void main(String[] args){
        int a = {1,-2,3,4,-2,1,-9};
        //sinh vien code tai day
        System.out.println("Tổng các phần tử lẻ là: " + sumNegativeElements());
        String s = "nguyen thi uyen an";
        //sinh vien code tai day
		String s1 = "Ho ten: Nguyen Thi Anh Dao";
		//sinh vien code tai day
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
		//sinh vien code tai day
    }
}