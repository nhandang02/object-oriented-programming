import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sum {
    public static void main(String [] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner sc = new Scanner(inputFile);
            int sum = 0;

            while(sc.hasNextInt()) {
                int num = sc.nextInt();
                sum += num;
            }
            sc.close();

            File outputFile = new File("output.txt");
            FileWriter writer = new  FileWriter(outputFile);
            writer.write(Integer.toString(sum));
            writer.close(); 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}