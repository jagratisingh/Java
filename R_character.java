import java.util.Scanner;
public class R_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str =sc.nextLine();
        System.out.println("Enter the new string:");
        String gtr = sc.nextLine();
        String newStr = str.replace(str.charAt(0),gtr.charAt(0));
        System.out.println(newStr);
        
    }
    
}
