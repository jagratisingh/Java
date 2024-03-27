import java.util.Scanner;
public class S_sumnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
         String str = sc.nextLine();
         int sum =0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            //int num = ch;
            if(ch>='0' && ch<='9'){
                  //'0' subtract from character means we are subtracted from char ascii value 
                  //like if we enter 1 - 48(ascii){0-9 : 48 -57(Ascii)} so we used here 
                  sum+=(ch-'0');
            }
        }
        System.out.println("the sum of num in a string: "+sum);
    }
    
}
