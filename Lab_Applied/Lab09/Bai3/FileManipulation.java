import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManipulation {
  
  public <E> boolean writeFile(String path, ArrayList<E> lst) {
    try {
      FileWriter writer = new FileWriter(path);
      for (E obj : lst) {
        writer.write(obj.toString() + "\n");
      }
      writer.close();
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

}