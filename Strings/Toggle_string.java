package Strings;
//prePINSTA : PREpinsta
import java.util.Scanner;
public class Toggle_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                char uch= (char)('A' + ch- 'a');
                str.setCharAt(i, uch);

            }
            else if(ch>='A' && ch<='Z'){
               char lch= (char)('a' + ch- 'A');
               str.setCharAt(i, lch);
            }
            
        }
        System.out.println(str);
        sc.close();
    }

    }
