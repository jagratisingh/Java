package MultiThreading;
public class App  {
    void series(){
        for(int i=1;i<=26;i++){
            System.out.println(i);
        }
    }
    void pattern(){
        for(char i='A';i<='Z';i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        App app = new App();
        Runnable r1=()->app.series();
        Thread t1= new Thread(r1);
        t1.start();
        Runnable r2 =()->app.pattern();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
