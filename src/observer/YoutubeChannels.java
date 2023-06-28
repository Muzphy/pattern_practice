package observer;

import java.util.ArrayList;

abstract class YoutubeChannels {
    ArrayList<Subscribers> subscriber = new ArrayList();

    public void addSubscriber(Subscribers sbs) {
        this.subscriber.add(sbs);
    }

    public void delSubscriber(Subscribers sbs){
        this.subscriber.remove(sbs);
    }

    protected void notifyObserver(){
        for(Subscribers s: subscriber){
            s.update();
        }
    }

    public abstract void publishVideos();
}
