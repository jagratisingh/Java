    public class Str_length
    {
  
    private static int recLength(String str)
    {
        // if we reach at the end of the string
        if (str.equals(""))
            return 0;
        else
            return recLength(str.substring(1)) + 1;
    }

    public static void main(String[] args)
    {
        String str ="Prepinsta";
        System.out.println("length of the string :"+recLength(str));
    }
}