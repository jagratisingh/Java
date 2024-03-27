import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings :");
        String str = sc.nextLine();
        String gtr = sc.nextLine();
        boolean check = true;
        /*  String s1 = str1.replaceAll("[\\s]", "");
         String s2 = str2.replaceAll("[\\s]", ""); */
         //one thing we can do just by replacing all spaces into removing space 
        if(str.length()!=gtr.length()){
            check = false;
        }
        else{
            char ch[]= str.toLowerCase().toCharArray();
            char gh[]= gtr.toLowerCase().toCharArray(); 
            Arrays.sort(ch);
            Arrays.sort(gh);
            //equals check only the string value not it's reference 
            check = Arrays.equals(ch,gh);
             
        }
        if(check){
             System.out.println("This is an anagram");
        }
        else{
             System.out.println("This is not anagram");
        }
    }
    
}
