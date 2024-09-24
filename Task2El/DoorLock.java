public class DoorLock implements Device {
    private int id;
    private String status;

    public DoorLock(int id) {
        this.id = id;
        this.status = "locked";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getType() {
        return "door lock";
    }

    public void lock() {
        status = "locked";
        System.out.println("Door " + id + " is locked.");
    }

    public void unlock() {
        status = "unlocked";
        System.out.println("Door " + id + " is unlocked.");
    }

    @Override
    public void turnOn() {
        unlock();
    }

    @Override
    public void turnOff() {
        lock();
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + status + ".";
    }
}