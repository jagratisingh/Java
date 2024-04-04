package Strings;
//remove all the characters from the string except alphabets
import java.util.Scanner;
public class Rem_ExAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch =str.toCharArray();
        int j=0;
        //store only valid elements
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'||ch[i]>='A' && ch[i]<='Z'){
                ch[j]=ch[i];
                j++;

            }
        }
        System.out.println(String.valueOf(ch).substring(0,j));
        sc.close();
    }
    
}
