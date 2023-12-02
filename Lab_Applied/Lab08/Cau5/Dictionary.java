import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String [] args) {
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("cat", "con meo");
        dictionary.put("soccer", "bong da");
        dictionary.put("dictionary", "tu dien");
        dictionary.put("badminton", "cau long");
        dictionary.put("swim", "boi ");
        dictionary.put("bird", "chim");
        dictionary.put("key", "chia khoa");
        dictionary.put("jogging", "chay bo");
        dictionary.put("private", "rieng tu");
        dictionary.put("basketball", "bong ro");
        dictionary.put("rectangle", "hinh chu nhat");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word to look up or enter 'close' to exit: ");
        String userEnter = sc.nextLine();
        String word = userEnter.toLowerCase();


        while(!word.equals("close"))
        {
            if(dictionary.containsKey(word))
            {
                System.out.println("Meaning of " + word + " is: " + dictionary.get(word));
            }
            else
            {
                System.out.println("The word " +  word + " is not exist in the dictionary");
            }
            
            System.out.print("Enter another word to look up or enter 'close' to exit: ");
            userEnter = sc.nextLine();
            word = userEnter.toLowerCase();
        }
    }
}