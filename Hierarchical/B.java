package Hierarchical;

public class B extends Program{
    int a=102;
    B(){
        System.out.println("Constructor of A");
    }
    static{
        System.out.println("Static block ");
    }
    /* //an initializer block is a block of code that is executed
    // when an object is created. It is used to initialize the instance variables of a class.
    // The initializer block is called automatically when an object is created, before the constructor is called. */
    {
        System.out.println("init block called after static method");
    }
    void display()
    {
        System.out.println("Parent class ");
    }
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(2*obj.a*obj.pi);
    }
    
}
