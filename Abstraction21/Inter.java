package Abstraction21;
interface animal{
    public void sound();
    public void food();
}
class dog implements animal{
    public void sound(){
        System.out.println("Dog is barking");
    }

    @Override
    public void food() {
        System.out.println("Eat roti");
    }

}
class cat implements animal{
         public void sound(){
               System.out.println("Miaaau");
         }
         public void food(){
             System.out.println("milk");
         }
}

public class Inter {
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
        c.food();

        dog d = new dog();
        d.sound();
        d.food();
        
    }
    
}
