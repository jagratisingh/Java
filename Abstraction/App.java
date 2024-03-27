package Abstraction;
import java.util.Scanner;
public class App extends Logic {
    private App(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number :");
        int num = sc.nextInt();
       /*  Logic l = new Logic();
        l.factorial(num); */
        App app = new App();
        app.checker(num);
        app.task(34, 40);
    }
    void task(int a , int b){
        System.out.println(a+b);
    }
}
