import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        System.out.println(str);
        int i=0;
        int j=str.length()-1;
        boolean flag = true; //palindrome 
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                  flag=false;//not palindrome
                  break;

            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("String is palindrome ");
        }
        else
        {
            System.out.println("String is not palindrome ");
        }
        
        
    
    }
}


