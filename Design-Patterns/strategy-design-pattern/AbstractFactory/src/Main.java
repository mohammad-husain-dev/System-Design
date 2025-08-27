
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IVehicleFactory Luxfactory=new LuxuryFactory();
		IVehicleFactory Ordfactory=new OrdinaryFactory();
		IVehicle v=Ordfactory.getVehicle("Punch");
		System.out.println(v.average());
	}

}
