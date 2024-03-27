import java.util.*;
public class PSubstring {
    public static void main(String[] args) {
       // String str ="abcd";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string :");
       String str = sc.nextLine();
        int count =0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
               
            }
            count ++;
            System.out.println();
            System.out.println("count :"+count);
        }
    }
    
}
