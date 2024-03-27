public class Num_Recursion {
    public static void main(String[] args) {
        Print(1);
        
    }
    public static void Print(int n){
        //base condition : where to stop, if you will not give this condition
        //you will run in the infinity loop
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again , it will treat as a separate call in the stack
        Print(n+1);

    }
    
}
