package observer;

public class SubscriberNormal implements Subscribers{
    @Override
    public void update() {
        System.out.println("normal subscribers get latest videos.");
    }
}
