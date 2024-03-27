package Interface;

public class Connector {
    int a =90; //abstract static final
    void design(); //abstract function public
    default void sum(){
        System.out.println("Default function");
    }
    static void message(){
        System.out.println("Message");
    }
}
