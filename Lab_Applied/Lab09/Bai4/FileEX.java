import java.io.*;
import java.util.*;

public class FileEX {
    public static void main(String[] args) {
        // Lấy các file có đuôi mở rộng nhất định trong thư mục được chỉ định
        File folder = new File(".\\data");
        File[] files = folder.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt"); // thay đổi đuôi mở rộng tùy ý
            }
        }); 
        for (File file : files) {
            System.out.println(file.getName());
        }
        
        // Kiểm tra xem một file hoặc thư mục được chỉ định có tồn tại hay không
        File file = new File(".\\data");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
        
        
        File dir = new File("data\\Dang.txt");
        if (dir.isDirectory()) {
            System.out.println("Path is a directory");
        } else if (dir.isFile()) {
            System.out.println("Path is a file");
        } else {
            System.out.println("Path does not exist");
        }
        
        // Thêm nội dung vào một file đã tồn tại
        try {
            FileWriter fw = new FileWriter("data\\Nhan.txt", true);
            fw.write("Appended text\n");
            fw.close();
            System.out.println("Text appended to file");
        } catch (IOException e) {
            System.out.println("Error appending text to file");
            e.printStackTrace();
        }
        
        // Tìm từ dài nhất trong một file văn bản
        try {
            File input = new File("data\\Thanh.txt");
            Scanner sc = new Scanner(input);
            String line;
            String longestWord = "";
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            System.out.println("Longest word in file: " + longestWord);
            sc.close();
        } catch (IOException e) {
            System.out.println("Error finding longest word in file");
            e.printStackTrace();
        }
    }
}