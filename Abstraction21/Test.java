package Abstraction21;
abstract class animal{
     /*  animal(){
         System.out.println("All types of animals");
      } */
      public abstract void sound();
}
class Dog extends animal{
   /*  Dog(){
         super();
    } */
    public void sound(){
        System.out.println("Dog is barking");
    }
      
}
class Lion{
    /* Lion(){
        super();
    } */
    public void sound(){
         System.out.println("Lion is roaring");
    }

}
public class Test {
    public static void main(String[] args) {
         Dog d = new Dog();
         d.sound();
         Lion l = new Lion();
         l.sound();
    }
    
}
