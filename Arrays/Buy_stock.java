package Arrays;
import java.util.Scanner;
public class Buy_stock {
    public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int Profit= MaxProfit(prices, n);
        System.out.println(Profit);
        sc.close();
    }
    public static int MaxProfit(int[] prices, int n){
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {
            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];
            // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;    
    }

}
