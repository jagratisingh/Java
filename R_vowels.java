import java.util.*;
public class R_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String newStr ="";
        for(int i=0;i<str.length();i++){
            newStr=str.replaceAll("[aeiou]","") ;      
        }
        System.out.print(newStr);
        System.out.println();
        for(int i=0;i<str.length();i++){
            newStr=str.replace("a","i") ;      
        }
        System.out.print(newStr);
    }
    
}
