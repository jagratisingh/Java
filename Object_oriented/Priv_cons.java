package Object_oriented;

public class Priv_cons {
    public static void main(String as[])
  {
    abc.add(4, 5);
    abc.sub(5, 3);
  }
}
final class abc
{
  //private constructor  
  private abc()
  {}
  public static void add(int a, int b)
  {
    int z = a+b;
    System.out.println("Addition: "+z);
  }
  public static void sub(int x, int y)
  {
    int z = x-y;
    System.out.println("Subtraction: "+z);
  }
  
}

  