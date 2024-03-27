import java.util.Scanner;

public class Dec_hex {
    public static void main(String[] args) {
       System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //integer array for storing binary digits 
        int[] hex= new int[20];
        int i=0;
		//writing logic for the conversion 
        while(n!=0){
             int rem=n%16;
             hex[i++]=rem;
             n=n/16;
        }
        //printing result
        System.out.print("Hexadecimal number : ");
        //starting i-1 bcoz posterior increment 
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(hex[j]+""); 
    }
}
