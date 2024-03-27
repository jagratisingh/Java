package MultiThreading;
import java.util.Random;

public class Cinema implements Runnable {

    @Override
    public void run() {
        
        synchronized(this){
            Payment();
        }
    }
    int ticket =5;
    int burger=3;
    public static void main(String[] args) {
        Cinema cinema= new Cinema();
        Thread t1 = new Thread(cinema);
        t1.setName("Jagrati");
        t1.start();
        Thread t2 = new Thread(cinema);
        t2.setName("Tanu");
        t2.start();
        Thread t3 = new Thread(cinema);
        t3.setName("Archana");
        t3.start();
        Thread t4 = new Thread(cinema);
        t4.setName("Abhay ");
        t4.start();
        Thread t5 = new Thread(cinema);
        t5.setName("kush");
        t5.start();
        Thread t6 = new Thread(cinema);
        t6.setName("Rudradev");
        t6.start();
    }
    private void Payment(){
        System.out.println("Current thread name: "+Thread.currentThread().getName());
        if(ticket>=1 && burger>=1){
            Random rand= new Random();
            long delay = rand.nextLong(3000,10000);
            try{
                Thread.sleep(delay);
                System.out.println("Confirm ticket with burger :" +Thread.currentThread().getName());
                ticket--;
                burger--;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else if(ticket>=1 && burger ==0){
            Random rand = new Random();
            long delay = rand.nextLong(3000,10000);
            try{
                Thread.sleep(delay);
                System.out.println("Confirm ticket with 20% discount: "+Thread.currentThread());
                ticket--;

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        else
         {
            System.out.println("Out of stock : "+Thread.currentThread());
         }
        }
    }
 