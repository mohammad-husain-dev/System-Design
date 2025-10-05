package youtube.Channels;

import youtube.Interfaces.IChannel;
import youtube.Interfaces.IUser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Channel implements IChannel {
    private String channelName;
    private final Set<IUser> users;
    private final List<String> videos;
    private String latest_video;


    public Channel(String channelName) {
        this.channelName = channelName;
        this.users = new HashSet<>();
        this.latest_video = "";
        this.videos = new ArrayList<>();
    }

    @Override
    public void subscribe(IUser user) {
        users.add(user);
    }

    @Override
    public void unsubscribe(IUser user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers() {
        for (IUser user : users) {
            user.update(this);
        }
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getLatestVideo() {
        return latest_video;
    }

    List<String> getAllContent() {
        return videos;
    }

    public void uploadVideo(String video_name) {
        latest_video=video_name;
        videos.add(video_name);
        notifyUsers();
    }
}
