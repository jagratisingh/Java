import java.util.Scanner;
public class Balanced_junction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //incoming pipes
        int n = sc.nextInt();
        //outgoing pipes
        int m = sc.nextInt();
        //rust factor
        int r = sc.nextInt();
        //for entering rated capacity of incoming pipes
        int[] arr = new int[n];
        int sumr=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sumr+=arr[i];

        }
        int sum1=sumr-(r*n);
        System.out.println(sum1);
        //for entering rated capacity of outcoming pipes
        int suma=0;
        int[] arr1 = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
            suma+=arr1[i];
        }
        int sum2=suma-(r*m);
        System.out.println(sum2);
        if(sum1>sum2){
              int sum=sum1-sum2;
              System.out.println((-1)*(sum+r));
        }
        else
        {
            System.out.println("BALANCED");
        }
      
    }
}
