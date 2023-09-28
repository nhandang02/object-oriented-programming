import java.util.Scanner;

public class Calculator {
    public double divide(int a, int b) throws ArithmeticException, NumberOutOfRangeException {
        if (b == 0) {
            throw new ArithmeticException("Chia cho so khong");
        }
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("So nam ngoai pham vi tinh toan");
        }
        return (double) a / b;
    }

    public int multiply(int a, int b) throws NumberOutOfRangeException {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("So nam ngoai pham vi tinh toan");
        }
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();

        Calculator calculator = new Calculator();
        try {
            System.out.println("Ket qua cua a / b: " + calculator.divide(a, b));
            System.out.println("Ket qua cua a * b: " + calculator.multiply(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Loi: " + e);
        } catch (NumberOutOfRangeException e) {
            System.out.println("Loi: " + e);
        }
    }
}
