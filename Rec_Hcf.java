public class Rec_Hcf {
    public static void main(String[] args) {
        int n1=12;
        int n2=4;
        int a = Hcf( n1 ,  n2);
        System.out.println("Hcf of two numbers :"+a);

    }
    public static int Hcf(int n1 , int n2){
        // Everything divides 0
         if(n1==0){
             return n2;
         }
         if(n2==0){
             return n1;
         }
         //base condition
         if(n1==n2){
            return n1;
         }
         

         if(n1>n2){
            return Hcf(n1-n2, n2);
        }
        return Hcf(n1,n2-n1);
    }
}
