import java.util.Scanner;
public class CAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        char ch = sc.next().charAt(0);
        if(ch>='A'&& ch>='A'|| ch>='a'&& ch>='z' ){
            System.out.println("this is an alphabet");
        }
        else{
            System.out.println("This is not an alphabet");
        }
    }
    
}
