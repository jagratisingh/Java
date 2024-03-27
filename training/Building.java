package training;

public class Building {
    Building(){
        System.out.println("contructor building");
    }
    void material(){
        System.out.println("Building needs material");
    }
    public static void main(String[] args) {
        Engineer en = new Engineer();
        Labour lab = new Labour();
        lab.skills();
        Builder bu = new Builder();
        bu.fund();
       // Builder bu2 = new Builder();
        Building build = new Building();
        build.material();
    }
    
}
