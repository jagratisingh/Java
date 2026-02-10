package HashCodeAndToString;

class Laptop {
     String brand;
     int price;

     //I can make my toString method
    //  public String toString(){
    //     return brand + " " + price;
    //  }
}
public class Demo{
    public static void main(String[] args){
        Laptop obj = new Laptop();
        obj.brand="Samsung";
        obj.price = 45000;
        //this obj called itself obj.toString by default 
        //that is come from the object class
        System.out.println(obj); // this is overriding by own to String method
        //so the output is coming like Samsung 45000 instead of hashcode something
        //if use this obj.ToString
        System.out.println(obj.toString());
        System.out.println(obj.brand);
        System.out.println(obj.price);

    }
}
