public class Demo {
    public static void main(String[] args){
        Variables obj = new Variables();
        //these variables was not assigned with any modifier
    
        obj.name= "Jagrati";
        obj.brand = "PlatesOfHappiness";
        obj.price = 220;

       //private variable concept 
       obj.setAge(23); 
       int res = obj.getAge();
      
       System.out.print(res);




    }
    
}
