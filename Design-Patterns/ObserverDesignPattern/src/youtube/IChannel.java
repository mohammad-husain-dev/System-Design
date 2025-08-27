package youtube;

public interface IChannel {
	public void subscribe(IUser user);
	public void unsubscribe(IUser user);
	public void notifyUsers();
	
	public String getChannelName();
	public String getLatestVideo();
}
