public class Rec_fac {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println("Factorial of n : "+ans);

        
    }
    public static int fact(int n){
        
        if(n<=1){
            return 1 ;
        }
        
        return n*fact(n-1);
       
    }
    
}
