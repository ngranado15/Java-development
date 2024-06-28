public class Moped extends Vehicles {
private int maxSpeed;

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String license, int maxSpeed) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.license = license;
        this.maxSpeed = maxSpeed;
    }

    private String license;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
