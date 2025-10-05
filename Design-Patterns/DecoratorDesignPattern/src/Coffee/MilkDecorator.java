package Coffee;

public class MilkDecorator extends CoffeeDecorator{
	
	public MilkDecorator(Coffee coffee)
	{
		super(coffee);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+" with milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+2.0;
	}

}
