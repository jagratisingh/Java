package Strings;
import java.util.Scanner;
public class Rem_Spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String str = sc.nextLine();
        String[] s= str.split("[\\s]");
        for(String string : s){
            sb.append(string);
        }
        System.out.println(sb);
    }
}
    