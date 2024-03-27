import java.util.Scanner;
public class R_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String newStr = "";
        for(int i=0;i<str.length();i++){
            //if we don't use ^ this symbol that means we are removing alphabets 
            // here we using it means we are removing the characters except alphabets
            newStr = str.replaceAll("[^a-zA-z]","");
              
        }
        System.out.print(newStr);
        
    }
    
}
