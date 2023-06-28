package factory.abstractFactory;

public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new Iphone();
    }
    @Override
    public PC makePC() {
        return new MAC();
    }
}
