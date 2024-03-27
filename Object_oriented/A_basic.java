package Object_oriented;

public class A_basic {

         public static int[] total(int a , int b){
            int[] s = new int[2];
            s[0]=a+b;
            s[1]=a-b;
            return s;

         }
     public static void main(String[] args) {
        int[] s = total(200,89);
        System.out.println("Addition of two values :"+s[0]);
        System.out.println("Subtraction of two values :"+s[1]);
      
     }
    
}
