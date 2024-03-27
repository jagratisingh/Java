package Object_oriented;

public class Object { 
    int a; 
    double b; 
    int c; 
    Object(int m, double d, int a) 
        { 
            a = m; 
            b = d; 
            c = a; 
        } 
    } 
    class MethodDemo4{ 
        static Object get(int x, int y) 
        { 
            //we are getting an object from the method call.
            // It can also be used to return collection of data.
            return new Object(x * y, (double)x / y, (x + y)); 
        } 
        public static void main(String[] args) 
        { 
            Object ans = get(25, 5); 
            System.out.println("Multiplication = " + ans.a); 
            System.out.println("Division = " + ans.b); 
            System.out.println("Addition = " + ans.c); 
        } 
    }
  

          
    

