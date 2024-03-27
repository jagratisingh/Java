package Inheritance;
// it is hierarchical inheritance
public class Single extends Triple {//or double for multilevel inheritance 

    public  void Inheritance(){
        ///super.Parent();
        System.out.println("single");
    }
    public static void main(String[] args) {
        Single obj = new Single();
        obj.Inheritance();
       // obj.Parent();
        obj.triple();
    }
    
}
