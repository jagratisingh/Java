<<<<<<< HEAD
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
             boolean check = true; // for capital
             char ch = str.charAt(i);//J
             if(ch==' ') continue;
             int asci = (int)ch;//74->J

             if(asci>=97)check =false;
             if(check==true){
                  asci+=32;//74+32=106
                  char dh = (char)asci;// dh->j
                  str.setCharAt(i, dh);//(0,j)
                    
             }
             else
             {
                  asci-=32;
                  char dh = (char)asci;
                  str.setCharAt(i, dh);
             }
            }
        System.out.println(str);         
    }
}
=======
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
             boolean check = true; // for capital
             char ch = str.charAt(i);//J
             if(ch==' ') continue;
             int asci = (int)ch;//74->J

             if(asci>=97)check =false;
             if(check==true){
                  asci+=32;//74+32=106
                  char dh = (char)asci;// dh->j
                  str.setCharAt(i, dh);//(0,j)
                    
             }
             else
             {
                  asci-=32;
                  char dh = (char)asci;
                  str.setCharAt(i, dh);
             }
            }
        System.out.println(str);         
    }
}
>>>>>>> d0730c8c7986ce0a13f434bb7641757adb3e1744
