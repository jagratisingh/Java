import java.util.Scanner;
public class Toggle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        StringBuilder  str =  new StringBuilder(sc.nextLine());
        for(int i= 0;i<str.length();i++){
            char ch =str.charAt(i);
            int asci = (int)ch;
            if(ch >=0 && ch<=9){
                continue;
            }
            /* if(ch == ' '){
                continue;
            } */
            if(ch >= 'A'&& ch<='Z'||ch >= 'a'&& ch<='z' ){
 
            if(asci >=97){
                asci-= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);     
            }
            else
            {
                asci+= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);     
            }
            }
         
        }
         System.out.println(str);
        
    }
}
    

