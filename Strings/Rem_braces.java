package Strings;
//remove all the braces from a algebric expression
import java.util.Scanner;
public class Rem_braces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.replaceAll("[{}()]","");
        System.out.println(s);

    }
    
}
