// HomeHub.java
import java.util.ArrayList;
import java.util.List;

public class HomeHub {
    private List<Device> devices;
    private List<Trigger> triggers;

    public HomeHub() {
        devices = new ArrayList<>();
        triggers = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println(device.getType() + " " + device.getId() + " added.");
    }

    public void turnOnDevice(int id) {
        Device device = findDeviceById(id);
        if (device != null) {
            device.turnOn();
        }
    }

    public void turnOffDevice(int id) {
        Device device = findDeviceById(id);
        if (device != null) {
            device.turnOff();
        }
    }

    public void setTrigger(String condition, String action) {
        triggers.add(new Trigger(condition, action));
        System.out.println("Trigger set: When " + condition + ", then " + action);
    }

    public void checkTriggers() {
        for (Trigger trigger : triggers) {
            if (trigger.evaluate(devices)) {
                executeAction(trigger.getAction());
            }
        }
    }

    public void getStatus() {
        for (Device device : devices) {
            System.out.println(device.getStatus());
        }
    }

    private Device findDeviceById(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                return device;
            }
        }
        System.out.println("Device with ID " + id + " not found.");
        return null;
    }

    private void executeAction(String action) {
        String[] parts = action.split("\\(");
        String command = parts[0];
        int id = Integer.parseInt(parts[1].replace(")", ""));

        if (command.equalsIgnoreCase("turnOn")) {
            turnOnDevice(id);
        } else if (command.equalsIgnoreCase("turnOff")) {
            turnOffDevice(id);
        }
    }
}
