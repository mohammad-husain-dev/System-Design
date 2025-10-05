package youtube.Users;

import youtube.Channels.Channel;
import youtube.Interfaces.IChannel;
import youtube.Interfaces.IUser;

import java.util.HashSet;
import java.util.Set;

public class User implements IUser {
    private String name;
    private String email;
    private String password;

    private final Set<IChannel> channels;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.channels = new HashSet<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean subscribe(IChannel channel) {
        channel.subscribe(this);
        return this.channels.add(channel);
    }

    public boolean unsubscribe(IChannel channel) {
        channel.unsubscribe(this);
        return this.channels.remove(channel);
    }

    /// / Observer method
    @Override
    public void update(IChannel channel) {
        Channel c=(Channel)channel;
        System.out.println(this.toString() + " : "+c.getLatestVideo());
    }
}
