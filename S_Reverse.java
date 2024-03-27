import java.util.Scanner;
public class S_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+= str.charAt(i);
            //System.out.print(rev);
            //System.out.println(str);
        }
        System.out.print(rev);


    }
    
}
