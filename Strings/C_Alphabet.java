package Strings;
//check whether a character is alphabet or not
import java.util.Scanner;
public class C_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <='z' || ch>='A' && ch<='Z') {
            System.out.println("Character is alphabet");
        }
        else
        {
        System.out.println("Not an alphabet");
        }
        sc.close();
}
}
