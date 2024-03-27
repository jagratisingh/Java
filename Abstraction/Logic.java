package Abstraction;

public class Logic {
    static{
        System.out.println("Static block of logic");
    }
    public Logic(){
         System.out.println("Logic construtor");
    }
    static void message(){
        System.out.println("Message is called");
    }
    {
        System.out.println("Init block from abstract class");
    }
    private void factorial(int num){
        int fact =1;
         for(int i=num;i>=1;i--){
            fact*=1;
         }
         System.out.println("factorial of"+num+ "is" +fact );
    }
    void checker(int num){
        if(this.getClass().getName().equals("App")){
            factorial(num);
        }
        else
        {
            System.out.println("Invalid request");
        }
 }
 abstract void task(int a , int b);
    
}
