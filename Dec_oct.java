import java.util.Scanner;

public class Dec_oct {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //integer array for storing binary digits 
        int[] oct= new int[20];
        int i=0;
		//writing logic for the conversion 
        while(n!=0){
             int rem=n%8;
             oct[i++]=rem;
             n=n/8;
      
  }
        //printing result
        System.out.print("Octal Number: ");
        //starting i-1 bcoz posterior increment 
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(oct[j]+"");
    }
}