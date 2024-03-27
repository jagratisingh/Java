
import java.util.Scanner;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char and get ascii value :");
        char ch = sc.next().charAt(0);
        int get = (int)ch;
        System.out.println(get +" is the ascii value for character "+ch);

    }
    
}
