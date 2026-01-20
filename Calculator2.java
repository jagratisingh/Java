public class Calculator2 {
    public static int function(int a,int b){
        return (a*b);
    }
    public int function(int a, int b, int c){
        return a+b;
    }
    public static void main(String[] args){
        int a=9;
        int b=10;
        int c=11;
        int result = function(a,b);
        System.out.println(result);
        Calculator2 calc = new Calculator2();
        int result2 = calc.function(a,b,c);
        System.out.println(result2);
    }
}
