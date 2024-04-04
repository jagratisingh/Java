package Strings;
import java.util.Scanner;
public class Remove_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder strWithoutVowels = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                strWithoutVowels.append(ch);
            }
        }
        System.out.println(strWithoutVowels);
        sc.close();


    }
    
}
