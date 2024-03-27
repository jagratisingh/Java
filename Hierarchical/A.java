package Hierarchical;

public class A extends Program {
    int r=90;
    A(){
        System.out.println("Constructor of A");
    }
    static{
        System.out.println("Static method ");
    }
    {
        System.out.println("init method");
    }
    void display()
    {
        System.out.println("Parent class ");
    }
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(2*obj.r*obj.pi);
    }
    
}
