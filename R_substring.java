import java.util.*;
public class R_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        System.out.println("String to be replaced :");
        String oldString= sc.nextLine();
        System.out.println("Enter the new String :");
        String newString =sc.nextLine();
        String replaceString = s.replace(oldString, newString);
        System.out.println(replaceString);
    }
    
}
