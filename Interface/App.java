package Interface;

public class App implements Connerctor {
    void home(Connector connector){
        System.out.println("Home page");
        connector.design();
    }
    public static void main(String[] args) {
        App app = new App();
        app.home(new Kotlin());
        app.home(new Java());
        System.out.println(connector.a);
        Connector.message();
        app.sum();
    
}
@Override
public void design()
}

