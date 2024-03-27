public class VideoGamesPurchase {
    public static int maxGamesToBuy(int p, int d, int m, int s) {
        int gamesBought = 0;
        while (s >= p) {
            s -= p;
            gamesBought++;
            p = Math.max(p - d, m); // Updating the price for the next game
        }
        return gamesBought;
    }
    public static void main(String[] args) {
        int p = 20; // Initial price
        int d = 3;  // Price decrement
        int m = 6;  // Minimum price
        int s = 80; // Total budget
        int maxGames = maxGamesToBuy(p, d, m, s);
        System.out.println("Maximum number of games to buy: " + maxGames); // Output: 6
    }
}

