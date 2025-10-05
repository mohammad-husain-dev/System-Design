package youtube.Interfaces;

public interface IChannel {
	public void subscribe(IUser user);
	public void unsubscribe(IUser user);
	public void notifyUsers();
}
