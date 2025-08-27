package youtube.Users;

import java.util.HashSet;
import java.util.Set;

import youtube.IChannel;
import youtube.IUser;

public class Dilshad implements IUser{
	Set<IChannel> subscribedChannels;
	public Dilshad() {
		// TODO Auto-generated constructor stub
		subscribedChannels=new HashSet<IChannel>();
	}
	@Override
	public void update(IChannel channel) {
		// TODO Auto-generated method stub
		System.out.println(channel.getLatestVideo());
	}
	
	public void subscribe(IChannel channel)
	{
		if(subscribedChannels.contains(channel)) return;
		subscribedChannels.add(channel);
		channel.subscribe(this);
	}
	
	public void unsubscribe(IChannel channel)
	{
		if(subscribedChannels.contains(channel))
		{
			subscribedChannels.remove(channel);
			channel.unsubscribe(this);
		}
	}
	
	public Set<IChannel> getAllSubscribedChannels()
	{
		return subscribedChannels;
	}
}
