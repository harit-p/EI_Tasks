public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        StockUser user1 = new StockUser("User1");
        StockUser user2 = new StockUser("User2");

        stock.addObserver(user1);
        stock.addObserver(user2);

        stock.setPrice(100.50);  // Stock price changed, both users get notified
        stock.setPrice(102.75);
    }
}
