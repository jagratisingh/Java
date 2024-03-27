import java.util.Scanner;
public class SmallestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Smallest(a);

    }
    public static void Smallest(int a){
        int j=0;
        int[] arr = new int[25];
        if(a<10){
            System.out.println(a+10);
        }
        else
        {
            for(int i=9;i>1;i--){
                while(a%i==0){
                    a=a/i;
                    arr[j]=i;
                    j++;
                }
            }
            if(j==0){
                System.out.println("Not possible");
            }
            else{
                for(int i=j-1;i>=0;i--){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}

