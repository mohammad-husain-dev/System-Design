
public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee=new BaseCoffee();
		coffee = new SugerDecorator(coffee);
		coffee = new MilkDecorator(coffee);
		coffee = new CreamDecorator(coffee);
		
		System.out.println(coffee.getDescription() +": "+coffee.getCost());
	}

}
