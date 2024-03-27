import java.util.Scanner;

public class Oct_Bin {
    public static void main(String[] args) {
        System.out.println("Enter the n:");
        Scanner sc = new Scanner(System.in);
        //input a octal number
        int n = sc.nextInt();
        //declaring to store decimal number
        int dec=0;
        //declaring variable to use in power
        int i=0;
        //Writing logic for the octal to decimal conversion
        while(n!=0){
              int rem=n%10;
              dec+= rem*(Math.pow(8,i));
              n=n/10;
              i++;
        }
         //integer array for storing binary digits 
         int[] bin= new int[20];
         int k=0;
         //writing logic for the conversion 
         while(dec!=0){
              int r=dec%2;
              bin[k++]=r;
              dec=dec/2;
         }
         //printing result
         System.out.print("Octal to Binary number : ");
         //starting i-1 bcoz posterior increment 
         for(int j = i-1 ; j >= 0 ; j--)
         System.out.print(bin[j]+"");
    }
    
}
