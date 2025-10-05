package Coffee;

public class SugerDecorator extends CoffeeDecorator{
	
	public SugerDecorator(Coffee coffee)
	{
		super(coffee);
	}

	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+" with Suger";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+1.0;
	}
}
