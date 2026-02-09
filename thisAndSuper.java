class C {
    public C(){
        //by default here super() method is called,
        //and here object is called by default
        System.out.println("in C");
    }
    public C(int n)
    {
        //by default here super() method is called
        System.out.println("in  C int");
    }

}
class B extends C {

    public B(){
        //by default here super() method is called
        System.out.println("in B");
    }
    public B(int n){
        //by default here super() method is called
        System.out.println("in B int");
    }

}
public class thisAndSuper extends B {
    public thisAndSuper(){
        //by default here super() method is called
        System.out.println("in thisAndSuper");
    }
    public thisAndSuper(int n)
    {
        //by default here super() method is called
        super(n);// will call the parameterized constructor of the super class
       // super(); //this will call by default parameterized constructor
        System.out.println("in thisAndSuper int");
    }
}
