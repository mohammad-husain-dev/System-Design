package Factory;

import Vehicles.Vehicle;

public class VehicleFactory {

    public static VehicleFactory getVehicleFactory(String type) {
        VehicleFactory vehicleFactory = null;
        switch (type) {
            case "Luxuary":
                vehicleFactory = new LuxuaryVehicleFactory();
                break;
            case "Ordinory":
                vehicleFactory = new OrdinoryVehicleFactory();
                break;
            default:
                break;
        }
        return vehicleFactory;
    }
}
