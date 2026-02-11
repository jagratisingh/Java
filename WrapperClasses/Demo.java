package WrapperClasses;

public class Demo {
    public static void main(String[] args)
    {
        int num = 9; //primitive type variable
        Integer num1 = num; //auto-boxing 
        //integer is a wrapper class and num1 is reference variable object for this 
        System.out.println(num1);

        int num2 = num1.intValue();
        System.out.println(num2);//unboxing

        String str ="12";
        int num3= Integer.parseInt(str);
        System.out.println(num3*2);



    }
    
}
