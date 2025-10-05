import Factory.LuxuaryVehicleFactory;
import Factory.VehicleFactory;
import Vehicles.IVehicle;

public class Main {
    public static void main(String[] args) {
        LuxuaryVehicleFactory vehicleFactory = (LuxuaryVehicleFactory) VehicleFactory.getVehicleFactory("Luxuary");
        IVehicle audi=vehicleFactory.createVehicle("Audi");
        audi.setMileage(50);
        System.out.println(audi.getMileage());
    }
}