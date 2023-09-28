import java.util.Vector;
import java.util.Scanner;

public class VectorEx
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a length for vector X: ");
        int n = sc.nextInt();

        Vector<Integer> X = new Vector<>();

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter ele " + i + " : ");
            int ele = sc.nextInt();
            X.add(ele);
        }
        System.out.println("Vector X: ");

        outputVector(X);

        Vector<Integer> Y = new Vector<>();

        for(int i = 0; i < n; i++)
        {
            int ele = 2 * X.get(i) * X.get(i) + 1;
            Y.add(ele);
        }

        System.out.println();
        System.out.println("Vector Y: ");

        outputVector(Y);

        sc.close();
    }

    public static void outputVector(Vector<Integer> X)
    {
        for(Integer ele : X)
        {
            System.out.print(ele + "  ");
        }
    }
}