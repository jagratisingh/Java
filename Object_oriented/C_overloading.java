package Object_oriented;

public class C_overloading {
    C_overloading(){
    }
    C_overloading(int x){
        
    }
    C_overloading(int x, int y){
        int z = x+y;
        System.out.println(z);      
    }
    public static void main(String[] args) {
        C_overloading c1 = new C_overloading();
        C_overloading c2 = new C_overloading(20, 30);
        C_overloading c3 = new C_overloading(67);
       /*  System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3); */

    }
    
}
