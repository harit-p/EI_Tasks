// Light.java
public class Light implements Device {
    private int id;
    private String status;

    public Light(int id) {
        this.id = id;
        this.status = "off";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return "light";
    }

    @Override
    public void turnOn() {
        status = "on";
        System.out.println("Light " + id + " turned on.");
    }

    @Override
    public void turnOff() {
        status = "off";
        System.out.println("Light " + id + " turned off.");
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + status + ".";
    }
}