import java.util.*;
public class DangThanhNhan_B5 {
    public static int specifiCelements(String arr[]){
        int count=0;
        for(int i=0; i < arr.length ;i++ ){
            boolean isUnique = true;
            for(int j=0; j<i;j++){
                if(arr[i].equalsIgnoreCase(arr[j])){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique) 
                count++;
        }
    return count;
    }
    public static String[] remove_Duplicate_Elements(String arr[]){
        int count=0;
        String arrNew[]= new String[specifiCelements(arr)];
        arrNew[count++] = arr[0];
        for(int i=1; i<arr.length; i++){
            boolean isUnique=true;
            for(int j=i-1; j>=0; j--){
                if(arr[i].equalsIgnoreCase(arr[j])){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                arrNew[count++] = arr[i];
            }
        }
        return arrNew;
    }
    public static void input(String arr[]){
        String temp[] = remove_Duplicate_Elements(arr);
        for(int i = 0; i < temp.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(temp[i].equalsIgnoreCase(arr[j])){
                    count++;
                }
            }
            System.out.println("'"+temp[i]+"' : "+count+",");
        }
    }
    public static void main(String[] args){
        String s = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it. ";
        
        String words[] = s.split("\\, |\\. |\\ ");
        input(words);
    
    }
}