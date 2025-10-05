package Factory;

import Vehicles.HondaCity;
import Vehicles.TataPunch;
import Vehicles.Vehicle;

public class OrdinoryVehicleFactory extends VehicleFactory {

    public static Vehicle createVehicle(String type){
        Vehicle vehicle = null;

        switch (type){
            case "HondaCity":
                vehicle = new HondaCity();
                break;
            case "Punch":
                vehicle = new TataPunch();
                break;
            default:
                break;
        }
        return vehicle;
    }
}
