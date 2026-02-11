package UpcastingAndDownCasting;

class A {
    public void show1(){
        System.out.println("in A");
    }
    
}
class B extends A{
    public void show2(){
        System.out.println("in B");
    }
}

public class Demo{
    public static void main(String[] args){
       A obj = new A();// this is called the upcasting 
       obj.show1();

       A obj1 = new B();
    //    obj.show2(); - this is causing error because we have created the object of B but reference type A so A does not know the B class
        obj1.show1();
       B obj2 = new B();
       obj2.show1();
       obj2.show2();
       B obj3 = (B) obj; //this is calling downcasting 
       obj3.show2();

    }
}