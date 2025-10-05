package Observer;

public class NewsChannel implements IObserver{
	String news;
	@Override
	public void update(String news) {
		// TODO Auto-generated method stub
		this.news=news;
		System.out.println(news);
	}

}
