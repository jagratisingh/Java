package MethodOverriding;

public class Demo {

    public static void main(String[] args){
        //here the confusion is B and A constructor, will read about it
        A obj = new A();
        obj.move();

    }
    
}
class A extends B{

    @Override
    public void move(){
        System.out.println("I am dancing in A");
    }
}
class B{

    public void move(){

      System.out.println("I am dancing in B");

    }
}
