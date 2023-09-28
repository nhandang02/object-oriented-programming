import java.util.Scanner;
public class DangThanhNhan_Bai014 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Menu----");
		System.out.println("1.Coca");
		System.out.println("2.Pepsi");
	    System.out.println("3.Sprite");
		System.out.println("4.Snack");
		System.out.println("5.Shutdown Machine");
		System.out.println("Please enter the number: ");
		int n = sc.nextInt();
		
		while(n<=0 || n>5) {
		    System.out.println("Please enter the valid number.");
		    n = sc.nextInt();
		}
		switch(n) {
		    case 1:
		        System.out.println("The price of Coca is: 2$, please enter the amount of money: ");
		        float mon1 = sc.nextInt();
	            if(mon1>=2)  System.out.printf("Your char is: %.1f$.", (mon1-2));
	            else System.out.println("Not money to buy this item. Please select again.");
	            break;
	            
            case 2:
                System.out.println("The price of Pepsi is: 3$, please enter the amount of money: ");
	            float mon2 = sc.nextInt();
	            if(mon2>=3)  System.out.printf("Your char is: %.1f$.", (mon2-3));
	            else System.out.println("Not money to buy this item. Please select again.");
	            break;
	            
	        case 3:
	            System.out.println("The price of Sprite is: 5$, please enter the amount of money: ");
	            float mon3 = sc.nextInt();
	            if(mon3>=5)  System.out.printf("Your char is: %.1f$.", (mon3-5));
	            else System.out.println("Not money to buy this item. Please select again.");
	            break;
	            
	        case 4:
	            System.out.println("The price of Snack is: 4$, please enter the amount of money: ");
	            float mon4 = sc.nextInt();
	            if(mon4>=4)  System.out.printf("Your char is: %.1f$.", (mon4-4));
	            else System.out.println("Not money to buy this item. Please select again.");
	            break;
	            
            case 5:
	            System.out.println("Machine is shutting down.");
	            break;
        }
	}
}