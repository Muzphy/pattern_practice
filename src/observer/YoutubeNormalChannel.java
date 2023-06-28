package observer;

public class YoutubeNormalChannel extends YoutubeChannels{
    public void publishVideos(){
        System.out.println("normal channels publish new videos");
        this.notifyObserver();
    }
}
