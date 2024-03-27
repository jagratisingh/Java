import java.util.Scanner;
public class F_lastchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        String newStr = "";
        //split the sentence into words we can use //s or " "
        String[] str = s.split(" ");  
       for(String string : str){
           //System.out.println(string);
           int length = string.length();
           //System.out.println(length);
           String firstchar = string.substring(0, 1);
           String restchar =  string.substring(1, length - 1);
           String lastchar = Character.toString(string.charAt(length - 1));
           newStr = newStr+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
           //returns a String object representing the specified char.
           //in substring endindex does not inclusive 
       }
       System.out.println(newStr);
       
    }
    
}
