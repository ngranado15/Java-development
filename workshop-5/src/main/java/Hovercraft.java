public class Hovercraft extends Vehicles {
    private String wheels;
    private String roadSafe;

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, String wheels, String roadSafe) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.wheels = wheels;
        this.roadSafe = roadSafe;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getRoadSafe() {
        return roadSafe;
    }

    public void setRoadSafe(String roadSafe) {
        this.roadSafe = roadSafe;
    }
}
