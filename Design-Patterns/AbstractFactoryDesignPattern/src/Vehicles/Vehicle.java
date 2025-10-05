package Vehicles;

public class Vehicle implements IVehicle {
    private int mileage;
    @Override
    public int getMileage() {
        return mileage;
    }

    @Override
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
