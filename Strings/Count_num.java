package Strings;
//count the sum of numbers present in a string
import java.util.Scanner;
public class Count_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //char[] ch = str.toCharArray();
        int sum=0;
        for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch>='0' && ch<='9'){
                    sum+=(ch-'0');
                }
        }
        System.out.println(sum);
        sc.close();
    }
    
}
