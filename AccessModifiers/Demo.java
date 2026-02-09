package AccessModifiers;

public class Demo {
    public static void main(String[] args){
        A obj = new A();
       // obj.name;
        obj.name = "Jagrati";  // protected variable
        obj.age = 23; // default variable
        obj.brand ="PlatesOfHappiness"; //public variable 
        obj.setSex("Female"); //private variable in another class
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.brand);
        System.out.println(obj.getSex());
    }
}
