package MultiThreading;

public class App2 {
    void series(){
        for(int i=0;i<=26;i++){
            System.out.println(i);
        }
    }
    void pattern(){
        for(char i='A';i<='Z';i++){
            System.out.println(i);
        }
    }
    void s(){
       for(int i=100;i<=126;i++){
        System.out.println(i);
       }
    }

    public static void main(String[] args) {
        App2 app = new App2();
        app.s();
        new Thread(){
            public void run(){
                app.series();
            };
        }.start();
         new Thread(){
            public void run(){
                app.pattern();
            };
        }.start();
    }
}

