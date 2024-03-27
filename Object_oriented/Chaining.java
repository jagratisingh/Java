package Object_oriented;

public class Chaining {
     Chaining(){
           this(10,20);
     }
     Chaining(int x , int y){
         int z = x+y;
         System.out.println(z);
     }
    public static void main(String[] args) {
        Chaining chain = new Chaining();
    

    }
    
}
