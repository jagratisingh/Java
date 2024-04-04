package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine().toLowerCase();
        String str2=sc.nextLine().toLowerCase();      
        boolean result = Checker(str1, str2);
        System.out.println(result);
        sc.close();

    }
    public static boolean Checker(String str1, String str2){
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        //sort both arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        //compare both arrays
        return Arrays.equals(charArray1, charArray2);
    }
    
}
