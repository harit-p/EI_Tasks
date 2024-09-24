import java.util.logging.Level;
import java.util.logging.Logger;

public class StockUser implements Observer {
    private static final Logger logger = Logger.getLogger(StockUser.class.getName());
    private final String name;

    public StockUser(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        logger.log(Level.INFO, "{0} notified. New stock price: ${1}", new Object[]{name, price});
    }
}
