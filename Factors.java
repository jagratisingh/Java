import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        System.out.println("Enter the num:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int ans=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                // ans=num/i;
                 System.out.println(i);
            }
          // System.out.println("Factors of a num:"+ans);   
        }
    }
    
}
