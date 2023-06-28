package observer;

public class SubscriberVip implements Subscribers{
    @Override
    public void update() {
        System.out.println("vip subscribers get latest videos.");
    }
}
