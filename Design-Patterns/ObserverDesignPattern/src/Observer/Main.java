package Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsAgency agency=new NewsAgency();
		
		NewsChannel channel1=new NewsChannel();
		NewsChannel channel2=new NewsChannel();
		
		agency.register(channel1);
		agency.register(channel2);
		
		agency.newUpdate("Ceasefire voilated");
	}

}
