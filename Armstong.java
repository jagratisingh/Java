import java.util.Scanner;
public class Armstong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int check = num;
        int sum=0;
        int len=0;
        while(num!=0){
            int rem=num%10;
            len++;
            num=num/10;

        }
        System.out.println(len);
       // System.out.println(sum);
      /*   if(check==sum){
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        } */
        
    }
    
}
