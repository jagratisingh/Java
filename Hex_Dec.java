/* import java.util.Scanner;
//import java.lang.Math;
public class Hex_Dec {
    public static void main(String[] args) {
        System.out.println("Enter the n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Convert(n);
        
    }
    public static void Convert(int n){
        int i=0;
        double sum =0;
        while(n!=0){
              int rem=n%10;
              double dec = (Math.pow(16,i));
              i+=1;
              double mul= dec*rem;
              sum+=mul;
              n=n/10;
        }
        System.out.println("Octal to Binary conversion:"+sum);
        
    }
}
 */
/* public class Hex_Dec{
    public static void main(String[] args) {
        String x="A";
        int y =Integer.parseInt(x,16);
        System.out.println(y);
    }
} */
public class Hex_Dec{
    public static void main(String[] args) {
        String hex ="C9";
        System.out.println((Convert(hex)));
        
    }
    public static int Convert(String hex){
        String digits ="0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val=0;
        for(int i=0;i<hex.length();i++){
            char c = hex.charAt(i);//c //9
            //indexOf:methods returns the position of the first occurence of specified 
            //character(s) in the strings
            int d=digits.indexOf(c);//12  //9
            val=16*val+d;//12*16+9=201
        }
        return val;
    }
}