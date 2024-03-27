package training;

public class App {
             /* public  static void Something(){
                System.out.println("static method");
              } */
              App(){
                System.out.println("constructor of App ");
              }
              void home(){
                         System.out.println("HOME PAGE");
              }
    public static void main(String[] args) {
        Computer com = new Computer();
        com.requirement();
        Desktop desk = new Desktop();
        desk.requirement();
        Laptop lap = new Laptop();
        lap.requirement();
        Developer dev = new Developer(lap);
        dev.java();
        App app = new App();
        app.home();

    }
    
}
