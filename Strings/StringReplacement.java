package Strings;
import java.util.Scanner;
public class StringReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the String:"); 
        String str=sc.nextLine();
        String oldStr= sc.nextLine();
        String newStr= sc.nextLine();
        String modifiedString=str.replace(oldStr, newStr);
        System.out.println("Modified String :"+modifiedString);
        sc.close();
        
    }
    
}
