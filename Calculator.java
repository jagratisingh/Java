public class Calculator {
    public int function(int a, int b){
        return a+b;
    }
    public int function(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        int a =9;
        int b=10;
        int c = 11;
        Calculator calc = new Calculator();
        
        int result = calc.function(a,b);
        int result1 = calc.function(a,b,c);
        System.out.println(result);
        System.out.println(result1);

    }
}
