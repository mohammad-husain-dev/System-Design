package Factory;

import Vehicles.Audi;
import Vehicles.Vehicle;

public class LuxuaryVehicleFactory extends VehicleFactory {

    public Vehicle createVehicle(String type) {
        Vehicle vehicle = null;
        switch (type){
            case "Audi":
                vehicle = new Audi();
                break;
            default:
                break;
        }

        return vehicle;
    }
}
