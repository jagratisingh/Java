package Strings;
import java.util.HashMap;
//calculate the frequency of each character in a string 
import java.util.Scanner;
public class Char_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        //iterate through each character in the string
        for(char ch : str.toCharArray() ){
            //update the frequency for the current character 
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        //print the frequency of each character
        System.out.println("character frequencies :");
        for(char ch : hm.keySet()){
            System.out.println("'"+ch+"' :"+hm.get(ch));
        }

        

    }
    
}
