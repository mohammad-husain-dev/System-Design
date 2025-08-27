
public interface IObservable {
	public boolean register(IObserver o);
	public boolean deRegister(IObserver o);
	public void notifyAllObservers();
}
