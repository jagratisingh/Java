import java.util.Scanner;
public class R_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String newStr ="";
        for(int i=0;i<str.length();i++){
            newStr = str.replaceAll("[(){}]","");

        }
        System.out.print(newStr);
    }
    
}
