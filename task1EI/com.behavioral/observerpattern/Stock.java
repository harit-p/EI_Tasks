import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Stock {
    private static final Logger logger = Logger.getLogger(Stock.class.getName());
    private final List<Observer> observers = new ArrayList<>();
    private double price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
        logger.info("Stock price updated and observers notified.");
    }
}
