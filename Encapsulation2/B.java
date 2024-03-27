package Encapsulation2;

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.setBalance(1000);
        a.setAge(20);
        a.setName("Jagrati singh");
        System.out.println("Jagrati has "+a.getBalance()+" and her age is " +a.getAge());
    }
    
}
