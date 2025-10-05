package youtube;

import youtube.Channels.Channel;
import youtube.Users.User;

public class Main {

    public static void main(String[] args) {
        Channel ndtv=new Channel("Ndtv");
        Channel sudoCode=new Channel("sudoCode");

        User user1 = new User("Mohammad", "abcd@gmail.com", "1234");
        User user2 = new User("Husain", "efgh@gmail.com", "5678");
        User user3 = new User("Dilshad", "ijkl@gmail.com", "9101");

        user1.subscribe(ndtv);
        user2.subscribe(sudoCode);
        user3.subscribe(ndtv);
        user2.subscribe(ndtv);

        ndtv.uploadVideo("Latest news-India defeats PAK in Asia Cup final");
        user1.unsubscribe(ndtv);
        user2.unsubscribe(ndtv);
        user3.unsubscribe(ndtv);
        ndtv.uploadVideo("A new video");
        sudoCode.uploadVideo("DSA Roadmap");
    }
}
