package Strings;
//capitalize the first and last character of each word
import java.util.Scanner;
public class Capitalize_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        String[] words = str.split("[\\s]");
        //iterate through each word
        for(String word : words){
            if(word.length()>1){
                //capitalize first character
                char fc = Character.toUpperCase(word.charAt(0));
                //capitalize last character
                char lc = Character.toUpperCase(word.charAt(word.length()-1));
                sb.append(fc).append(word.substring(1,word.length()-1)).append(lc).append(" ");
            }
            //if string has only one word , don't do nothing 
            else
            {
                sb.append(word).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
    
}
