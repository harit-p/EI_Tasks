public class Thermostat implements Device {
    private int id;
    private int temperature;

    public Thermostat(int id) {
        this.id = id;
        this.temperature = 70; // Default temperature
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return "thermostat";
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + id + " set to " + temperature + " degrees.");
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat " + id + " is now active.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat " + id + " is now inactive.");
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees.";
    }
}