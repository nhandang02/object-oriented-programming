import java.util.ArrayList;

public class TestBai3 {
  
  public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<>();
    
    // Calculate GPA and create Student objects
    Student student1 = new Student("Dang Thanh Nhan", "522H0006", 8.0);
    student1.setGpa(3.5);
    studentList.add(student1);
    
    Student student2 = new Student("Vo Nhat Hao", "522H0090", 8.5);
    student2.setGpa(4.0);
    studentList.add(student2);
    
    // Write ArrayList to file
    String path = "students.txt";
    FileManipulation fileManipulation = new FileManipulation();
    boolean success = fileManipulation.writeFile(path, studentList);
    
    if (success) {
      System.out.println("Successfully wrote file.");
    } else {
      System.out.println("Failed to write file.");
    }
  }
}
