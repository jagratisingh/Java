package FinalKeyword;

class AdvCalc {

    public final void show(){
        System.out.println("in A adv Calculator");
    }
    public int add(int a , int b){
         return a+b;
    }
    
}
class Calc extends AdvCalc{
    //final methods can override
    //final classes cannot be inherited
    // public void show(){
    //     System.out.println("in a Calc class");
    // }

}

public class Demo{
   public static void main(String[] args){
        AdvCalc obj = new Calc();
        obj.show();
   }
}
