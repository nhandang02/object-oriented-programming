import java.util.*;
import java.io.*;

public class UpperCaseFile {
  public static void main(String[] args) {
    try {
      File inputFile = new File("input.txt");
      Scanner sc = new Scanner(inputFile);
      StringBuilder sb = new StringBuilder();

      while (sc.hasNextLine()) {
        String line = sc.nextLine();
        sb.append(line.toUpperCase());
        sb.append("\n");
      }
      sc.close();

      File outputFile = new File("output.txt");
      FileWriter writer = new FileWriter(outputFile);
      writer.write(sb.toString());
      writer.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}