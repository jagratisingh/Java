package Object_oriented;

public class Methods {

    public static String GetName(String st){
        String name ="Jagrati ";
        name = name+st;
        return name;

    }
    public static void main(String[] args) {
        String val = GetName("singh");
        System.out.println("value: "+val);
    }
    
}
