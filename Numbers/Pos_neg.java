package Numbers;

public class Pos_neg {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    if(num<0){
        System.out.println("Negative");
    }
    else if(num>0)
    {
        System.out.println("Positive");
    }
    else
    {
        System.out.println("0");
    }
   }

}
