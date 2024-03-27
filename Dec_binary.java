import java.util.Scanner;
public class Dec_binary {
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //integer array for storing binary digits 
        int[] bin= new int[20];
        int i=0;
		//writing logic for the conversion 
        while(n!=0){
             int rem=n%2;
             bin[i++]=rem;
             n=n/2;
        }
        //printing result
        System.out.print("Binary number : ");
        //starting i-1 bcoz posterior increment 
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(bin[j]+"");
    }
        
}

