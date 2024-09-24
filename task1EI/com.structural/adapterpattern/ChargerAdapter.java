public class ChargerAdapter implements Charger {
    private final IndianCharger indianCharger;

    public ChargerAdapter(IndianCharger indianCharger) {
        this.indianCharger = indianCharger;
    }

    @Override
    public void charge() {
        indianCharger.plugIn();
    }
}
