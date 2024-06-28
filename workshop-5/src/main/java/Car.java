public class Car extends Vehicles{
    private int mileage;
    private int doors;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int mileage, int doors) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.mileage = mileage;
        this.doors = doors;
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
}
