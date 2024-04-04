<<<<<<< HEAD
import java.util.*;
public class Toggle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>=0 && ch<=9){
                continue;
            }
            if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z' ){
            boolean flag = true; //if capital
            int asci = (int)ch;
            if(asci>=97) flag = false ;
            if(flag==true){
                  asci+=32;
                  char dh = (char)asci;
                  str.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
             }
        }
    }
        System.out.println(str);
    }
    
}
=======
import java.util.*;
public class Toggle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>=0 && ch<=9){
                continue;
            }
            if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z' ){
            boolean flag = true; //if capital
            int asci = (int)ch;
            if(asci>=97) flag = false ;
            if(flag==true){
                  asci+=32;
                  char dh = (char)asci;
                  str.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
             }
        }
    }
        System.out.println(str);
    }
    
}
>>>>>>> d0730c8c7986ce0a13f434bb7641757adb3e1744
