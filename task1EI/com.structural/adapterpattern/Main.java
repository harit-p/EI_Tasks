public class Main {
    public static void main(String[] args) {
        IndianCharger indianCharger = new IndianCharger();
        Charger adapter = new ChargerAdapter(indianCharger);
        adapter.charge(); 
    }
}
