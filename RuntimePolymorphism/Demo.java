package RuntimePolymorphism;

 class A {
    public void show(){
        System.out.println("I am in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("I am in B");
    }

}

public class Demo{
    public static void main(String[] args){

        //this concept is called the dynamic dispatch 
        //and also called the runtime polymorphism
        
        A obj = new B();
        obj.show();

        obj = new A();
        obj.show();
    }
    
}
