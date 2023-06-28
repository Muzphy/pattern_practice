package factory.abstractFactory;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new Miphone();
    }
    @Override
    public PC makePC() {
        return new MiPC();
    }
}
