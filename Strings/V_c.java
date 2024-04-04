package Strings;
import java.util.Scanner;
//check whether a character is vowel or consonant 
public class V_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //enter a character 
        char ch = sc.next().charAt(0);
        //converting into lower case
        ch = Character.toLowerCase(ch);
        //check v/c
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              System.out.println("This is a vowel");
        }
        else
        {
            System.out.println("This is a consonant");
        }

        sc.close();
    }
    
}
