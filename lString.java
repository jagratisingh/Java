import java.util.Scanner;
public class lString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        int length= 0;
        for(char ch : str.toCharArray()){
              length++;
        }
        System.out.println("The length of the String :"+length);
    }
    
}
