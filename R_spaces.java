import java.util.Scanner;
public class R_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String newStr = "";           
        for(int i=0;i<str.length();i++){
           newStr = str.replace(" ","");
        }          
        System.out.println(newStr);
        //using string builder we can do this as well see prepinsta 100 codes of string 
    /*     String[] s1 = str.split("[\\s]");
	for (String string : s1) {
		sb.append(string);
	}
    System.out.println(sb); */
    }
    
}
