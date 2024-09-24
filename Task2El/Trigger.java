// Trigger.java
import java.util.List;

public class Trigger {
    private String condition;
    private String action;

    public Trigger(String condition, String action) {
        this.condition = condition;
        this.action = action;
    }

    public boolean evaluate(List<Device> devices) {
        for (Device device : devices) {
            if (device instanceof Thermostat) {
                Thermostat thermostat = (Thermostat) device;
                // Simple trigger logic: temperature > 75
                if (condition.equals("temperature > 75") && thermostat.getStatus().contains("degrees")) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getAction() {
        return action;
    }
}
