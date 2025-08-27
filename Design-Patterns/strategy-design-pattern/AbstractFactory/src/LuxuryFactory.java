
public class LuxuryFactory implements IVehicleFactory{
	
	public IVehicle getVehicle(String model)
	{
		if(model.equals("Mercedes"))
			return new Mercedes();
		if(model.equals("BMW"))
			return new BMW();
		return null;
	}
}
