package factory.factoryMethod;

public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        Iphone iphone = new Iphone();
        return iphone;
    }
}
