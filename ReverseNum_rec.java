public class ReverseNum_rec {
        public static void main(String[] args) {
         int n = 1234;   
         Reverse(n);
    }
    public static void Reverse(int n){
          //base condition
          if(n<10){
             System.out.println(n);
             return ;
          }
          else
          {
             System.out.print(n%10);
             Reverse(n/10);
          }
    }
}
