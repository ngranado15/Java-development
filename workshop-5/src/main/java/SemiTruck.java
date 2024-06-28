public class SemiTruck extends Vehicles {
    private int mileage;
    private int doors;
    private String fuelType;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int mileage, int doors, String fuelType) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.mileage = mileage;
        this.doors = doors;
        this.fuelType = fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
