package factory.factoryMethod;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new Miphone();
    }
}
