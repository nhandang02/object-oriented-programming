import java.util.*;
public class DangThanhNhan_TestFractionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st fraction: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        DangThanhNhan_FractionI f1 = new DangThanhNhan_FractionArr(a, b);
        System.out.print("Enter 2nd fraction: ");
        a = sc.nextInt();
        b = sc.nextInt();
        DangThanhNhan_FractionI f2 = new DangThanhNhan_FractionArr(a, b);
        System.out.println("1st fraction is " + f1);
        System.out.println("2nd fraction is " + f2);
        // The rest of the code is the same as TestFraction.java

        f1 = f1.simplify();
        f2 = f2.simplify();

        if (f1.equals(f2))
                System.out.println("The fractions are the same.");
                else
                System.out.println("The fractions are not the same.");

                DangThanhNhan_FractionI sum = f1.add(f2);
                System.out.println("Sum is " + sum);

                DangThanhNhan_FractionI subs = f1.minus(f2);
                System.out.println("Subs is " + subs);

                DangThanhNhan_FractionI prod = f1.times(f2);
                System.out.println("Prod is " + prod);
    }
}