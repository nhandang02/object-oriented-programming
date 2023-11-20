import java.util.Scanner;
public class DangThanhNhan_B4 {
	public static int countName(String s) {
		int dem = 0;
        	char[] c = s.toCharArray();
        	for (int i = 0; i < s.length(); i++) {
           	if (c[i] == ' ') {
                		dem += 1;
            	}
        	}
        	return dem + 1;
   	 }

	public static int checkPalin(String s ) {
		StringBuilder ss = new StringBuilder(s);
        	ss.reverse();
        	String s1 = new String(ss);
        	if (s.equals(s1)) 
           		return 1;
        	return 0;
    	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string: ");
        	String s = sc.nextLine();

		System.out.println("Length of the string is " + s.length());
		System.out.println("Number of word in the string is " + countName(s));
	
        	System.out.println("Enter the string want to concat ");
        	String s1 = sc.nextLine();
        	s = s.concat(" " + s1);

        	System.out.println("String after concat is : " + s);
        	if (checkPalin(s) == 1)	System.out.println("Is palindrome string");
        	else	System.out.println("Is not palindrome string");
    	}
}