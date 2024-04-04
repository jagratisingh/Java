package Strings;
import java.util.HashMap;
//find non repeating characters in a string
import java.util.Scanner;
public class Non_repChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> charCount= new HashMap<>();
        //count the frequency of each element
        for(char ch : str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        //printing non repeating characters
        for(char ch : str.toCharArray()){
            if(charCount.get(ch)==1){
                System.out.print(ch +" ");

            }
        }
    }
}
