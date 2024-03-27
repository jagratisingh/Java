package MultiThreading;

import java.util.Random;
public class Sync implements Runnable {
    int product_quantity=3;
    public static void main(String[] args) {
        Sync s = new Sync();
        Thread t1 = new Thread(s);
        t1.setName("Jagrati");
        t1.start();
        Thread t2 = new Thread(s);
        t1.setName("Rishabh");
        t1.start();
        Thread t3 = new Thread(s);
        t1.setName("Archana");
        t1.start();
        Thread t4 = new Thread(s);
        t1.setName("Tanu");
        t1.start();
        Thread t5 = new Thread(s);
        t1.setName("Kush");
        t1.start();
    }
    public void run(){
        System.out.println("1-"+Thread.currentThread().getName());
        synchronized(this){
            payment();
        }
    }
    private void payment(){
        System.out.println("2-"+Thread.currentThread().getName());
        if(product_quantity>=1){
            Random random =  new Random();
            long delay = random.nextLong(3000,10000);
            System.out.println(delay);
            try{
                Thread.currentThread();
                Thread.sleep(delay);
                System.out.println("Payment done "+Thread.currentThread().getName());
                product_quantity--;

            }catch(Exception e ){
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Out of stock");
        }
    }
}
