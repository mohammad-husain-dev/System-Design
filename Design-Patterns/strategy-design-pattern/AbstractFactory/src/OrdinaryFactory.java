
public class OrdinaryFactory implements IVehicleFactory{
	
	public IVehicle getVehicle(String name)
	{
		if(name.equals("Punch"))
			return new Punch();
		else return null;
	}
}
