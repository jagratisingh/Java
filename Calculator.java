import java.util.Scanner;
public class Calculator {   
    public static void main(String[] args) {
        //take input from user until user does not X or x
        System.out.println("Enter the operator :");
        Scanner sc = new Scanner(System.in);
        int ans=0;
        while(true){
            //take the operator as input
            char op = sc.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'|| op=='%'){
                System.out.println("Enter two inputs :");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(op=='+'){
                    ans = num1+num2;
                }
                if(op=='-'){
                    ans = num1-num2;
                }
                if(op=='*'){
                    ans = num1*num2;
                }
                if(op=='/'){
                     if(num2!=0){
                     ans = num1/num2;
                     } 
                }
                if(op=='%')
                {
                    ans = num1%num2;
                }
                else if(op=='X'|| op=='x'){
                   break;
                }
                else
                 {
                     System.out.println("Invalid answer"); 
                 }
                 System.out.println(ans);
            }
           // System.out.println(ans);
        }
       
        
    }
    
    

    
}
