package Modifiers;
//import pkg_name.classname : which you want to perform operation
import Modifiers2.C; 

public class A  extends C {
    public static void main(String[] args) {
        B obj = new B();
        // System.out.println(obj.a);//private : with in the class 
        System.out.println(obj.b);//default:within the package
        System.out.println(obj.c);//protect:within the package and can be access by subclass
        System.out.println(obj.d);//public:can be access from anywhere 
        C obj2 = new C();
        // System.out.println(obj2.a);
        //System.out.println(obj2.b);//default:within the package
        // System.out.println(obj2.c);//protected :within the package and can be access by sublcass
        System.out.println(obj2.t);
        A ob = new A();//for applying inheritance we create this class obj and get the value       
        //protected: using inheritance we can access the protected variable 
        System.out.println(ob.s);
        System.out.println(ob.t);//public 


    }

    
}
