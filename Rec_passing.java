public class Rec_passing {
    public static void main(String[] args) {
        Passing(5);

        
    }
    public static void Passing(int n){
        if(n==0){
             return ;
        }
        System.out.println(n);
      //  Passing(n--); it just give infinity
        Passing(--n);
    }
}
