import java.util.Scanner;
import java.util.Random;
public class Game{
    public static void main(String[] args){
        System.out.println("Enter 0 for rock , 1 for paper, 2 for scissor :");
        Scanner sc =new Scanner(System.in);
        int userinp=sc.nextInt();
        Random random=new Random();
        int com=random.nextInt(3);
        if(userinp==com){
            System.out.println("Draw");
        }
       else if(userinp==0&&com==2||userinp==1&&com==0&&userinp==2&&com==1){
           System.out.println("Congratulations ,you win!");
       }
       else{
           System.out.println("computer win!");
       }
       if(com==0){
           System.out.println("computer choice : rock");
       }
       if(com==1){
        System.out.println("computer choice : paper");
       }
       if(com==2){
        System.out.println("computer choice :scissor"); 
       }
    }
}