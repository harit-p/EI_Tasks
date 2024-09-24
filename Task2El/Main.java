// Main.java
public class Main {
    public static void main(String[] args) {
        HomeHub hub = new HomeHub();

        // Add devices using factory
        Device light1 = DeviceFactory.createDevice("light", 1);
        Device thermostat = DeviceFactory.createDevice("thermostat", 2);
        Device door = DeviceFactory.createDevice("door", 3);

        hub.addDevice(light1);
        hub.addDevice(thermostat);
        hub.addDevice(door);

        // Control devices
        hub.turnOnDevice(1);
        hub.getStatus();

        // Set a trigger to turn off the light when temperature exceeds 75
        hub.setTrigger("temperature > 75", "turnOff(1)");

        // Simulate temperature change
        ((Thermostat) thermostat).setTemperature(80);
        hub.checkTriggers(); // Should turn off light 1

        hub.getStatus(); // Check final status
    }
}
