import java.util.Scanner;

public class Bin_oct {
    public static void main(String[] args) {
        System.out.println("Enter the n :");
        //Scanner class object creation
        Scanner sc = new Scanner(System.in);
        //input from user
        int n = sc.nextInt();
        int dec = 0;
        //Declaring variable to use in power
        int i=0;
        while(n!=0){
          int rem=n%10;
           dec+=rem*Math.pow(2,i);
           n=n/10;  
           i++;    
       }
       //integer array for storing octal
       int[] oct= new int[20];
       int k=0;
       //writing logic for the conversion 
       while(dec!=0){
            int r=dec%8;
            oct[k++]=r;
            dec=dec/8;
     
 }
       //printing result
       System.out.print("Binary to octal : ");
       //starting i-1 bcoz posterior increment 
       for(int j = i-1 ; j >= 0 ; j--)
       System.out.print(oct[j]+"");
    }
}
