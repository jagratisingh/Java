public class Perfect {
    public static void main(String[] args) {
        int num =7;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                  sum=sum+i;

            }
        }
        if(sum==num){
              System.out.println("This is a perfect number ");
        }
        else
        {
             System.out.println("This is not a perfect number");
        }
    }
}
