package observer;

public class YoutubePlatform {
    public static void main(String[] args) {
        YoutubeChannels ycs = new YoutubeNormalChannel();
        ycs.addSubscriber(new SubscriberNormal());
        ycs.addSubscriber(new SubscriberVip());
        ycs.publishVideos();
    }
}
