import java.util.*;
public class Vconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char :");
        char ch = sc.next().charAt(0);
       /*  if(ch == 'a'||ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            System.out.println(ch +" is a vowel");
        }
        else{
            System.out.println(ch+ " is a consonant");
        } */
        if(isVowel(ch)){
            System.out.println( ch+ " is a vowel");
        }
        else
        {
            System.out.println(ch+" is a consonant");
        }
        
    }
    public static boolean isVowel(char ch){
         ch = Character.toUpperCase(ch);
           return (ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U');
        }
    
}
