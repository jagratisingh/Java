public class Rec_sum {
    public static void main(String[] args) {
       int res = Sum_of_digits(1234);
       System.out.println("sum of digits :"+res);
    }
    public static int Sum_of_digits(int n){
          if(n==0){
             return 0;
          }
          return n%10+ Sum_of_digits(n/10);
    }
}
