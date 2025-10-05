package Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements IObservable{
	
	List<IObserver> observers;
	String news;
	
	public NewsAgency()
	{
		this.observers=new ArrayList<IObserver>();
	}
	
	public void newUpdate(String update)
	{
		this.news=update;
		notifyAllObservers();
	}
	
	@Override
	public boolean register(IObserver o) {
		// TODO Auto-generated method stub
		observers.add(o);
		return true;
	}

	@Override
	public boolean deRegister(IObserver o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		return true;
	}

	@Override
	public void notifyAllObservers() {
		// TODO Auto-generated method stub
		for(IObserver o: observers)
		{
			o.update(news);
		}
		
	}
	

}
